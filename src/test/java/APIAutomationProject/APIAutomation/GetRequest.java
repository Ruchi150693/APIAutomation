package APIAutomationProject.APIAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest {
	public static void main(String[] args) {
		
		Response response=given().contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIStudentsList");
		System.out.println("Status code is :"+response.statusCode());
		System.out.println("Response body is :"+response.asString());
		
	}

}
