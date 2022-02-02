package stepDefinition;

import static io.restassured.RestAssured.given;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Assignment1 {
	@Given("API for testing")
	public void api_for_testing() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		given().contentType(ContentType.JSON);
		System.out.println("API for testing");
	}

	@When("posted with correct information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
				
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusLine());
		
			}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Response res = get("https://reqres.in/api/users?page=2");;
		System.out.println(res.getStatusCode());
		
		int statusCode= res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}

}
