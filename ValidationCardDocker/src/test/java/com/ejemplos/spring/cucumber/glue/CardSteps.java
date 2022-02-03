package com.ejemplos.spring.cucumber.glue;

import com.ejemplos.spring.cucumber.CucumberIntegrationTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class CardSteps extends CucumberIntegrationTest {
	/*
	 * @Scenario("^cliente hace una llamada a POST /validate") public void
	 * the_client_call_POST_validate() throws Throwable { RestAssured.baseURI =
	 * "http://localhost:8080";
	 * RestAssured.given().post("/card/validate").then().statusCode(200); }
	 */
	@When("^el cliente llama a /card")
	public void the_client_call_POST() throws Throwable {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/card/validate").then().statusCode(200);
	}

	@Given("^si el cliente pasa el validador")
	public void the_client_success_POST() throws Throwable {
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
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/card/validate").then()
				.statusCode(200).log().all();
	}

	@Then("^el cliente resive un mensage de success status 200")
	public void the_client_receives_message_success_status_200() throws Throwable {
		JSONObject request = new JSONObject();
		request.put("num1", 3242);
		request.put("num2", 3242);
		request.put("num3", 3242);
		request.put("num4", 3242);
		request.put("month", 3);
		request.put("year", 23);
		System.out.println(request.toJSONString());

		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/card/validate").then()
				.statusCode(200).log().all();
	}

	@Given("^si el cliente no pasa el validador")
	public void the_client_fail_POST() throws Throwable {
		JSONObject request = new JSONObject();
		request.put("num1", 32425);
		request.put("num2", 3242);
		request.put("num3", 3242);
		request.put("num4", 3242);
		request.put("month", 1);
		request.put("year", 20);

		System.out.println(request.toJSONString());

		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/card/validate").then()
				.statusCode(400).log().all();
	}

	@Then("^el cliente recibe un mensaje de Error status 400")
	public void the_client_receives_message_error() throws Throwable {
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
				.accept(ContentType.JSON).body(request.toJSONString()).when().post("/card/validate").then()
				.statusCode(400).log().all();
	}
}
