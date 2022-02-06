package assignment3;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Assertion1 {
	Response res;	
	@Given("sending the put request for Assertion")
	public void sending_the_put_request_for_assertion() {
		given().header("Content-Type", "application/json");
		System.out.println("sending the put request");
	    
	}
	@When("Check put request with correct validation request for Assertion")
	public void check_put_request_with_correct_validation_request_for_assertion() {
		System.out.println("-------------------------------------");
		res=given().header("Content-Type", "application/json").body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
		.put("https://reqres.in/api/users/2");
		
		System.out.println(res.getStatusLine());
		System.out.println("-------------------------------------");
	}
	@Then("Update Assretion")
	public void update_assretion() {
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("--------------------------------------------");
		System.out.println("Updated Successfully");
		System.out.println(res.statusCode());
	}
}
//@Test
//public void test_1() {
//	Response res = get("https://reqres.in/api/users?page=2");
//	given().header("Content-Type", "application/json")
//	.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
//	.put("https://reqres.in/api/users/2").
//
//	then().statusCode(200).log().all();
//
//	int statusCode = res.getStatusCode();
//	Assert.assertEquals(statusCode, 200);
//	
//	System.out.println("--------------------------------------------");
//
//}
