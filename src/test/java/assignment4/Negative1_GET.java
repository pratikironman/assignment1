package assignment4;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Negative1_GET {

	RequestSpecification request;
	
	Response res;
	
	@Given("API for testing negative Get method")
	public void api_for_testing_negative_get_method() {
		
		System.out.println("GIVEN");
		System.out.println("API for testing negative Get method");
		
		RestAssured.baseURI="https://reqres.in";
		request=given().header("Content-Type", "application/json");
	    
	}

	@When("retrieved incorrect informantion")
	public void retrieved_incorrect_informantion() {
		
		System.out.println("WHEN");
		String path="api/unknown/23";
		res=request.get(path).then().log().all().extract().response();
		
		
	    
	}

	
	@Then("Validate negative response code for negative Get method")
	public void validate_negative_response_code_for_negative_get_method() {
		
		System.out.println("THEN");
		Assert.assertEquals(404, res.getStatusCode());
		System.out.println(res.getStatusLine());
	}


}
