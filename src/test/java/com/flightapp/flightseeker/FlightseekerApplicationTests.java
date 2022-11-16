package com.flightapp.flightseeker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;

//Set up random port for testing purposes
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RyanairApplicationTests {

	private TestRestTemplate testRestTemplate;

	@Autowired // Asking Spring to inject the builder
	private RestTemplateBuilder restTemplateBuilder;

	@LocalServerPort // Port injected by Spring
	private int port;

	@BeforeEach
	void setUp() {
		restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
		testRestTemplate = new TestRestTemplate(restTemplateBuilder);
	}

	@DisplayName(" ")
	@Test
	void contextLoads() {
	}

}
