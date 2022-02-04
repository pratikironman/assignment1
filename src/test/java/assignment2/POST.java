package assignment2;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class POST {
	Response res;
//	@Test
//	public void test1() {
//
////	Response res1= given().log().all()
////			.header("Content-Type","application/json")
////			.body("{\r\n"
////					+ "    \"name\": \"ABC\",\r\n"
////					+ "    \"job\": \"leader\"\r\n"
////					+ "}")
////			.when().post("https://reqres.in/api/users")
////			.then().log().all().statusCode(201).extract().response();
//
//		given().header("Content-Type", "application/json")
//				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
//				.post("https://reqres.in/api/users").
//
//				then().statusCode(201).log().all();
//	}
	
	@Given("sending the post request")
	public void sending_the_post_request() {
		System.out.println("sending the post request");
	}

	@When("Check post request with correct validation request")
	public void check_post_request_with_correct_validation_request() {
		System.out.println("-------------------------------------");
		res=given().header("Content-Type", "application/json")
		.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
		.post("https://reqres.in/api/users");

		System.out.println(res.getStatusLine());
		System.out.println("-------------------------------------");
	}

	@Then("Post information the user")
	public void post_information_the_user() {
		System.out.println("Post information the user ");
		res.then().log().all();
	    
	}
}