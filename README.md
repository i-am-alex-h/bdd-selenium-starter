# Cucumber, Selenium, POM kick off

A starter project if you need Behavior-driven Development with Cucumber, Selenium, a remote WebDriver and the Page Object Model.  All running in Docker.

The `flask` service uses `flask run` to start a simple development webserver.  The development webserver is not suitable for use in production.

## Starting and stopping the containers
````
docker compose up -d --build
docker compose down --rmi local
````

## Running the tests
````
docker compose exec cucumber bash
mvn validate
mvn compile
mvn test
````
