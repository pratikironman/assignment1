package assignment2;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class GET {
	
	Response res;
//	@Test
//	public void test_01() {
//		given().header("Content-Type", "application/JSON").when().get("https://reqres.in/api/users?page=2").then()
//				.statusCode(200).log().all().extract().response();
//	}
//	
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
		
	}


}
