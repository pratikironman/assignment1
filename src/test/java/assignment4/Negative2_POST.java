package assignment4;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Negative2_POST {
	RequestSpecification request;

	Response res;

	@Given("API for testing negative Post method")
	public void api_for_testing_negative_post_method() {

		System.out.println("GIVEN");
		System.out.println("API for testing negative Get method");

		RestAssured.baseURI = "https://reqres.in";
		request = given().header("Content-Type", "application/json");
	}

	@When("retrieved incorrect informantion to update")
	public void retrieved_incorrect_informantion_to_update() {
		res = given().header("Content-Type", "application/json").body("{\r\n" + "\"email\": \"sydney@fife\",\r\n")
				.when().post("https://reqres.in/api/register");
		System.out.println("-------------------------------------");
		System.out.println(res.getStatusLine());

	}

	@Then("Validate negative response code for negative Post method")
	public void validate_negative_response_code_for_negative_post_method() {
		// res.then().log().all().extract().response();
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 400);
		System.out.println(res.print());
		System.out.println("--------------------------------------------");
	}

}
