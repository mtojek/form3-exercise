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

The log dump indicates that the API server has started successfully:
```
...
2018-10-19 19:41:57.709  INFO 98970 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-19 19:41:57.722  INFO 98970 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
2018-10-19 19:41:57.722  INFO 98970 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2018-10-19 19:41:57.755  INFO 98970 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2018-10-19 19:41:58.082  INFO 98970 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2018-10-19 19:41:58.406  INFO 98970 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2018-10-19 19:41:58.414  INFO 98970 --- [           main] pl.tojek.marcin.form3.Form3Application   : Started Form3Application in 47.598 seconds (JVM running for 51.146)
```

Swagger UI: [swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Run tests

API is covered with BDD tests. 

Run:
```
$ mvn test
```

Results:
```
Tests run: 49, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 57.368 s
[INFO] Finished at: 2018-10-19T19:40:14+02:00
[INFO] Final Memory: 21M/220M
[INFO] ------------------------------------------------------------------------
```
