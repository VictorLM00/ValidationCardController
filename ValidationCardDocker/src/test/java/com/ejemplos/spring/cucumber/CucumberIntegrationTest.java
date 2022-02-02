package com.ejemplos.spring.cucumber;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.ejemplos.spring.ValidationCardDockerApplication;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = {ValidationCardDockerApplication.class, CucumberIntegrationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = ValidationCardDockerApplication.class, loader = SpringBootContextLoader.class)

@CucumberOptions(plugin = {"pretty"}, tags = "", features = "src/main/resources/card.feature")
public class CucumberIntegrationTest {
	// implementation executePost
}
