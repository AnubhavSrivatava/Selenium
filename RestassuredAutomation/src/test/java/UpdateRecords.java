
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class UpdateRecords {
@Test
	public void UpdateRecord() {
		int empid = 15410;

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RequestSpecification request = RestAssured.given();
		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Zion");
		requestParams.put("age", 23);
		requestParams.put("salary", 12000);

		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json");

		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());

		// The actual request being passed equalizes to
		// http://dummy.restapiexample.com/api/v1/update/15410
		// Here, we capture the response for PUT request by passing the associated empID
		// in the baseURI
		Response response = request.put("/update/" + empid);

		int statusCode = response.getStatusCode();
		System.out.println(response.asString());
		Assert.assertEquals(statusCode, 200);

	}
}