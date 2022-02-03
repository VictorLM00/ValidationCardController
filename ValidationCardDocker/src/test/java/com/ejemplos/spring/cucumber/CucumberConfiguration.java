package com.ejemplos.spring.cucumber;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.ejemplos.spring.ValidationCardDockerApplication;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ValidationCardDockerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = ValidationCardDockerApplication.class, loader = SpringBootContextLoader.class)
public class CucumberConfiguration {

}
