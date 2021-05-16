package restAssuredpackage;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Demo_put {
	@Test
	public void test_put() {
	
	JSONObject obj = new JSONObject();
	obj.put("name", "vichitra");
	obj.put("job", "Testing");
	
	//System.out.println(obj);if it throws error, use below one
	System.out.println(obj.toJSONString());
	
	given().
	body(obj.toJSONString()).
			when().
			post("https://reqres.in/api/users").
			then().
			statusCode(200);
	}
}
