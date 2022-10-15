# spring-boot-forum 

### Database Setup
Before deployment, please make sure MySQL database is up and running:

- Default schema name is `db_springboot_forum`
- Default username is `root` 
- Default password is `root`

You can also edit database configuration in `src/main/resources/application.properties` on your own.

### STMP Email Service
STMP Email service configuration is in `src/main/resources/application.properties`. You are encouraged to use your own STMP service, but you are also welcome to use mine for testing purpose.

```
Server can be accessed on http://localhost:8080.
