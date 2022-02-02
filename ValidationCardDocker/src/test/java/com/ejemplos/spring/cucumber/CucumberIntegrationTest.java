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
public class CucumberIntegrationTest {

	@Then("^el cliente resive un mensage de success")
	public void the_client_receives_message_success(@Valid Card card, BindingResult result, ModelMap model)
			throws Throwable {
		JSONObject request = new JSONObject();
		request.put("num1", "3242");
		request.put("num2", "3242");
		request.put("num3", "3242");
		request.put("num4", "3242");
		request.put("month", "3");
		request.put("year", "23");

		System.out.println(request.toJSONString());

		RestAssured.baseURI = "http://localhost:8080";

		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/").then().statusCode(201).log()
				.all();

	}

	@Then("^el cliente resive un mensage de success")
	public void the_client_receives_message_error(@Valid Card card, BindingResult result, ModelMap model)
			throws Throwable {
		JSONObject request = new JSONObject();
		request.put("num1", "32425");
		request.put("num2", "3242");
		request.put("num3", "3242");
		request.put("num4", "3242");
		request.put("month", "1");
		request.put("year", "20");

		System.out.println(request.toJSONString());

		RestAssured.baseURI = "http://localhost:8080";

		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/").then().statusCode(400).log()
				.all();
	}
}
