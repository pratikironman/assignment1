package assignment2;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DELETE {
	
	Response res;
//	@Test
//	public void test_01() {
//		Response res= given().delete("https://reqres.in/api/users/2").then().log().all().extract().response();
//		System.out.println(res.statusCode());
//	}
	
	@Given("sending the delete request")
	public void sending_the_delte_request() {
		System.out.println("Sending the delete Request");
	}
	
	@When("Check for deleting with correct validation request")
	public void check_for_deleting_with_correct_validation_request() {
		System.out.println("-------------------------------------");
		System.out.println(RestAssured.delete("https://reqres.in/api/users/2").getStatusLine());
		System.out.println("-------------------------------------");	
	}

	@Then("Delete the user")
	public void delete_the_user() {
		given().delete("https://reqres.in/api/users/2").then().extract().response();
		System.out.println("Deleted Successfully");
	}

}
