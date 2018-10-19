package pl.tojek.marcin.form3.cucumber;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pl.tojek.marcin.form3.Form3Application;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Form3Application.class, webEnvironment = DEFINED_PORT)
@ContextConfiguration
public class CucumberRoot {

    private static final HttpClient HTTP_CLIENT = HttpClientBuilder.create().build();

    protected TestRestTemplate restTemplate;

    public CucumberRoot(@Autowired TestRestTemplate testRestTemplate) {
        // Fix for Spring Boot's default TestRestTemplate for PATCH method support
        testRestTemplate.getRestTemplate().setRequestFactory(new HttpComponentsClientHttpRequestFactory(HTTP_CLIENT));
        restTemplate = testRestTemplate;
    }
}
