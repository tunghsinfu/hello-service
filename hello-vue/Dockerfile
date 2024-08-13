# 使用 node slim 版本作为基础镜像来减少大小
FROM node:slim AS build
WORKDIR /app

# 注入环境变量
ARG ARG_FROM_COMPOSE_ONE
ARG ARG_FROM_COMPOSE_TWO

# 暴露变量到构建阶段
ENV VITE_API_ONE=$ARG_FROM_COMPOSE_ONE
ENV VITE_API_TWO=$ARG_FROM_COMPOSE_TWO

# 复制 package.json 和 package-lock.json（如果存在）
COPY package*.json ./

# 安装依赖
RUN npm install

# 复制其他所有文件
COPY . .

# 开发环境
FROM build AS development
CMD ["npm", "run", "dev"]
# 设置环境变量（如果需要的话）
# ENV VITE_API_ONE=$ARG_FROM_COMPOSE_ONE
# ENV VITE_API_TWO=$ARG_FROM_COMPOSE_TWO

# 构建生产环境的静态文件
FROM build AS builder
RUN npm run build

# 使用 nginx 作为最终生产环境的基础镜像
FROM nginx:stable AS production
COPY --from=builder /app/dist /usr/share/nginx/html

# 暴露 80 端口
EXPOSE 80

# 启动 nginx
CMD ["nginx", "-g", "daemon off;"]
