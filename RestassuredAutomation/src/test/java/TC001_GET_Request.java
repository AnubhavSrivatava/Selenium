import org.bouncycastle.asn1.ocsp.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
@Test
void getweatherDetails()
{
 //Specify base URI
 RestAssured.baseURI="https://rahulshettyacademy.com/maps/api/place";
 
 //Request object
 RequestSpecification httpRequest=RestAssured.given();
 
 //Response object for query param
 Response response=httpRequest.queryParam("key", "qaclick123").queryParam("key", "f198114e9a8291a2309ea9312b442a9f").get("/address");
 
 // Response object for Path param
// Response response=httpRequest.request(Method.GET,"/Hyderabad");
 
 //print response in console window
 
 String responseBody=response.getBody().asString();
 System.out.println("Response Body is:" +responseBody);
 
 int statuscode=response.statusCode();
 
 Assert.assertEquals(statuscode, 200);
	}
}
