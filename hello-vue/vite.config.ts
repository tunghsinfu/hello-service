import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      '/api1': {
        target: 'http://localhost:18080/api/',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api1/, ''),
      },
      '/api2': {
        target: 'http://localhost:18081/api/',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api2/, ''),
      },
    }
  }
})
