package com.ejemplos.spring.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // ejecutar pruebas de Cucumber con JUnit
@CucumberOptions(features = "src/main/resources") // especificamos la ubicación del archivo Gherkin
public class CucumberConfiguration{

}
