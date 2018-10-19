# form3-exercise

Here is the solution for the **Form3 Coding Exercise**.

## Technologies, languages

Service:
* Java 8
* Spring Boot
* Spring Data
* Swagger UI

Tests (BDD):
* Cucumber
* Gherkin

Database:
* Mongo (embedded)

## API Design

PDF Export: [API Design](https://github.com/mtojek/form3-exercise/blob/master/API_design.pdf)

## Getting started

Run:
```
$ mvn spring-boot:run
```

Swagger UI: [swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Run tests

API is covered with BDD tests. 

Run:
```
$ mvn test

...
Results :

Tests run: 49, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 57.368 s
[INFO] Finished at: 2018-10-19T19:40:14+02:00
[INFO] Final Memory: 21M/220M
[INFO] ------------------------------------------------------------------------
```
