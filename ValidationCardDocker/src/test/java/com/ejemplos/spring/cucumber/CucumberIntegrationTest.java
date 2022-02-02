package com.ejemplos.spring.cucumber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.ejemplos.spring.ValidationCardDockerApplication;

import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ValidationCardDockerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = ValidationCardDockerApplication.class, loader = SpringBootContextLoader.class)

@CucumberOptions(plugin = { "pretty" }, tags = "", features = "../src/main/resources/")
public class CucumberIntegrationTest {
	private static final Logger log = LoggerFactory.getLogger(CucumberIntegrationTest.class);

	@Before
	public void setUp() {
		log.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}
}
