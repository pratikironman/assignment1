package assignment2;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class PUT {
	Response res;
//	@Test
//	public void test_1() {
//		given().header("Content-Type", "application/json")
//				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
//				.put("https://reqres.in/api/users/2").
//
//				then().statusCode(200).log().all();
//
//	}

	@Given("sending the put request")
	public void sending_the_put_request() {
		given().header("Content-Type", "application/json");
		System.out.println("sending the put request");
	    
	}

	@When("Check put request with correct validation request")
	public void check_put_request_with_correct_validation_request() {
		System.out.println("-------------------------------------");
		res=given().header("Content-Type", "application/json").body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
		.put("https://reqres.in/api/users/2");
		
		System.out.println(res.getStatusLine());
		System.out.println("-------------------------------------");
		
	}

	@Then("Update the user")
	public void update_the_user() {
		System.out.println("Updated Successfully");
		System.out.println(res.statusCode());
	}
}
