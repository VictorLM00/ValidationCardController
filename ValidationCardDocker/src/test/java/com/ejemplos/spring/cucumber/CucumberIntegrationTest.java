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

@RunWith(Cucumber.class) // ejecutar pruebas de Cucumber con JUnit
@CucumberOptions(features = "src/main/resources") // especificamos la ubicación del archivo Gherkin
public class CucumberIntegrationTest {

	@When("^el cliente llama a /")
	public void the_client_issues_POST_version() throws Throwable {
		// executeGet("http://localhost:8888/version");
	}

	@Then("^el cliente resive un mensage de success")
	public void the_client_receives_message_success(@Valid Card card, BindingResult result, ModelMap model)
			throws Throwable {
		
	}

	@And("^el cliente resive una pagina con un mesage de compra realizada")
	public void the_client_receives_web_message(String web) throws Throwable {
		// assertThat(latestResponse.getBody(), is(version));
	}
}
