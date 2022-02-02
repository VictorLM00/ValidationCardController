package com.ejemplos.spring.cucumber;

import static org.hamcrest.CoreMatchers.is;

import javax.validation.Valid;

import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.ejemplos.spring.model.Card;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

@RunWith(Cucumber.class) // ejecutar pruebas de Cucumber con JUnit
@CucumberOptions(features = "src/main/resources") // especificamos la ubicación del archivo Gherkin
public class CucumberConfiguration{

}
