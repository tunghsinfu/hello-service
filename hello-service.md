# hello-service


## docker


## environment variables

[Set environment variables within your container's environment | Docker Docs](https://docs.docker.com/compose/environment-variables/set-environment-variables/)

## Merge Compose files
[Merge Compose files | Docker Docs](https://docs.docker.com/compose/multiple-compose-files/merge/)


## Spring

### Environment Variables

[Using Environment Variables in Spring Boot’s Properties Files | Baeldung](https://www.baeldung.com/spring-boot-properties-env-variables)

## maven

```
<groupId>com.hello</groupId>
<artifactId>hello-spring-api</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>spring-api</name>
```

> The artifactId helps identify the project. The name is simply a human-readable "friendly" name. It is not required for a basic setup.


## vue

### Env Variables and Modes

[Env Variables and Modes | Vite](https://vitejs.dev/guide/env-and-mode)

> To prevent accidentally leaking env variables to the client, only variables prefixed with VITE_ are exposed to your Vite-processed code.

> It's important to note that NODE_ENV (process.env.NODE_ENV) and modes are two different concepts.

## Template Syntax

![directive.DtZKvoAo.png (1376×440)](https://vuejs.org/assets/directive.DtZKvoAo.png)

### Router

#### Nested Named Views

```
/settings/emails                                       /settings/profile
+-----------------------------------+                  +------------------------------+
| UserSettings                      |                  | UserSettings                 |
| +-----+-------------------------+ |                  | +-----+--------------------+ |
| | Nav | UserEmailsSubscriptions | |  +------------>  | | Nav | UserProfile        | |
| |     +-------------------------+ |                  | |     +--------------------+ |
| |     |                         | |                  | |     | UserProfilePreview | |
| +-----+-------------------------+ |                  | +-----+--------------------+ |
+-----------------------------------+                  +------------------------------+
```

#### RouterView slot

[RouterView slot | Vue Router](https://router.vuejs.org/guide/advanced/router-view-slot)