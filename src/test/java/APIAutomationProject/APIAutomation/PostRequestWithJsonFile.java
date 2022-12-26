package APIAutomationProject.APIAutomation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostRequestWithJsonFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("../APIAutomation/BodyData.json");
		FileReader fReader=new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fReader);
		JSONObject jsonObject= new JSONObject(jsonTokener);
		
//		System.out.println("Enter the value of id: ");
//		Scanner scanner= new Scanner(System.in);
//		Integer idValue= scanner.nextInt();
		
		Random random=new Random();
		Integer idValue=random.nextInt();
		
		System.out.println("Enter value of firstname: ");
		Scanner scanner2=new Scanner(System.in);
		String firstnameValue=scanner2.next();
		
		
		String data = jsonObject.toString();
		data=data.replaceAll(Pattern.quote("{{id}}"), idValue.toString());
		data=data.replaceAll(Pattern.quote("{{firstname}}"), firstnameValue);
		
		System.out.println(data);
		

		Response response = given().contentType(ContentType.JSON).body(data).when().post("http://localhost:3000/APIStudentsList");
			
		System.out.println("Status code : "+response.statusCode());
		
	}

}
