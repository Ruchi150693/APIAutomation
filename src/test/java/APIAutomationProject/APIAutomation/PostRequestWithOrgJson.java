package APIAutomationProject.APIAutomation;

import org.json.JSONArray;
import org.json.JSONObject;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.net.URI;
import java.util.Random;

public class PostRequestWithOrgJson {

	public static void main(String[] args) {
		
		//for(int i=0;i<5;i++)
		//{
		//Random random=new Random();
		//Integer id = random.nextInt();
		JSONObject innerJsonObject1 = new JSONObject();
		innerJsonObject1.put("House No","123");
		innerJsonObject1.put("Sector", "22");
		innerJsonObject1.put("type", "primary address");
		
		JSONObject innerJsonObject2 = new JSONObject();
		innerJsonObject2.put("Lane No","12");
		innerJsonObject2.put("Area", "Chandigarh");
		innerJsonObject2.put("type", "secondary address");
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(0,innerJsonObject1);
		jsonArray.put(1,innerJsonObject2);
		
		JSONObject outerjsonObject = new JSONObject();
		outerjsonObject.put("firstname","Ruchi");
		outerjsonObject.put("lastname", "Kachroo");
		outerjsonObject.put("id", 1234501);
		//outerjsonObject.put("id", id);
		outerjsonObject.put("designation", "Test Specialist");
		//outerjsonObject.put("address",innerJsonObject1);
		outerjsonObject.put("address", jsonArray);
		System.out.println(outerjsonObject);
		 
		Response response=
		given()
		.contentType(ContentType.JSON)
		.body(outerjsonObject.toString())
		.when()
		.post("http://localhost:3000/APIStudentsList");
		
		System.out.println("Status code : "+response.statusCode());
		}
	
}
