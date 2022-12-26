package APIAutomationProject.APIAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithPOJOClass {

	public static void main(String[] args) {
		
		AddressInformation addressInformation =new AddressInformation();
		addressInformation.setHouseNo("123");
		addressInformation.setWardNo("12");
		addressInformation.setType("Primary Address");
		
		BasicInformation basicInformation =new BasicInformation();
		basicInformation.setId("RK2");
		basicInformation.setFirstname("Ruchi");
		basicInformation.setLastname("Kachroo");
		basicInformation.setDesignation("Test Specialist");	
		basicInformation.setAddressInformation(addressInformation);
	
		
		
		Response response=given().contentType(ContentType.JSON).body(basicInformation).when().post(" http://localhost:3000/APIStudentsList");
		System.out.println(response.asString());
		System.out.println("Status Code : "+response.getStatusCode());
	
	}
}
