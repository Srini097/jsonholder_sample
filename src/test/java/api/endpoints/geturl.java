package api.endpoints;
import static io.restassured.RestAssured.*;

import api.routes.urls;
import io.restassured.response.Response;
public class geturl {

	public Response geturl() {
	Response res= given().headers("x-api-key", "reqres-free-v1").when().get(urls.geturl);
	return res;
	
	}
}
