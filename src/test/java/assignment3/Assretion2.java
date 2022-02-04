package assignment3;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Assretion2 {
	Response res;

//	@Test
//	public void test_2() {
//		res = given().log().all().queryParam("page", "2").header("Content-Type", "application/json").when()
//				.get("https://reqres.in/api/users?page=2").then().log().all().statusCode(200).extract().response();
//		int statusCode = res.getStatusCode();
//		Assert.assertEquals(statusCode, 200);
//		
//		System.out.println("--------------------------------------------");
//	}
	
	@Given("sending the url request")
	public void sending_the_url_request() {
	    res= given().header("Content-Type", "application/JSON").when().get("https://reqres.in/api/users?page=2");
	}

	@When("posted with correct validation request")
	public void posted_with_correct_validation_request() {
		//res.then().statusCode(200);
		System.out.println(res.getStatusLine());
	}

	@Then("print all the list of users")
	public void print_all_the_list_of_users() {
		res.then().log().all().extract().response();
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		System.out.println("--------------------------------------------");
		
	}
}
