# user-service

The `user-service` is a lightweight backend microservice implemented in Java with Spring Boot and built using Maven. It exposes RESTful endpoints for user management (CRUD), uses Spring Data JPA for persistence, includes validation and centralized error handling, and is covered by unit and integration tests. For local development run `mvn spring-boot:run`, configure environment-specific settings in `src/main/resources/application.yml` (or `application.properties`), and build a production artifact with `mvn clean package`. Project structure highlights: `src/main/java` for controllers, services, and repositories; `src/main/resources` for configuration; `src/test/java` for tests.

The 'CI/CD' pipeline is defined in `.github/workflows/ci-cd-pipeline.yml`, which automates building, testing, and deploying the application on code changes.

Test Jenkins integration with the following steps:
1. Ensure Jenkins is set up with the necessary plugins for Maven and GitHub integration.
2. Create a new Jenkins job and configure it to pull the code from the GitHub repository
3. Set up the build steps to run Maven commands such as `mvn clean install` to build and test the application.
4. Configure post-build actions to deploy the application if the build is successful.

Day 3:
1. Review and enhance the existing unit tests in `src/test/java` to improve code coverage.
2. Implement integration tests to verify the interaction between different components of the application.
3. Set up a local database (e.g., H2 or PostgreSQL) for testing purposes.
4. Document the testing strategy and how to run tests in the `ReadMe.md` 


Day 4:
1. Added User DTOs for data transfer between layers.
