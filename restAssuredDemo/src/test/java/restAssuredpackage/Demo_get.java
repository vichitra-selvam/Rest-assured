package restAssuredpackage;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Demo_get {
	
	@Test
	public void test_get() {
		
		
		given().get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[0]", equalTo(7)).
		body("data.first_name", hasItems("Michael","Rachel","George"));
		
	}

}
