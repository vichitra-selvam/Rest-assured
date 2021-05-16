package restAssuredpackage;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Demo_post {
	@Test
	public void test_post() {
		
		
		JSONObject obj = new JSONObject();
		obj.put("name", "vichitra");
		obj.put("job", "Testing");
		
		System.out.println(obj);
		//or
		System.out.println(obj.toJSONString());
		
		given().
		header("content-Type", "application/JSON").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
				when().
				put("https://reqres.in/api/users/2").
				then().
				statusCode(200).
				log().all();
		
		}
@Test
public void test_patch() {
		
		
	
	JSONObject obj = new JSONObject();
		obj.put("name", "vichitra");
		obj.put("job", "Testing");
		
		System.out.println(obj);
		//or
		System.out.println(obj.toJSONString());
		
		given().
		header("content-Type", "application/JSON").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
				when().
				patch("https://reqres.in/api/users/2").
				then().
				statusCode(200).
				log().all();
			}
}
