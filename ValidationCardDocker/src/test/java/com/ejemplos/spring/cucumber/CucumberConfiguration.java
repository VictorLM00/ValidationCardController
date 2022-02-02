package com.ejemplos.spring.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//To configure and run Cucumber

@RunWith(Cucumber.class) // ejecutar pruebas de Cucumber con JUnit
//especificamos la ubicación del archivo Gherkin
@CucumberOptions(features = "src/test/resources", glue = "classpath:com.ejemplos.spring.cucumber", plugin = { "pretty", "json:target/cucumber-report.json" }) 
public class CucumberConfiguration {

}
