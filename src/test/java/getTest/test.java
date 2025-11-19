package getTest;

import java.util.List;

import org.testng.annotations.Test;

import api.endpoints.geturl;
import io.restassured.response.Response;

public class test {

	@Test
	public void get() {
		geturl gu =  new geturl();
		Response res =gu.geturl();
		System.out.println(res.getBody().asPrettyString());
		
//		System.out.println(res.jsonPath().getString("data.email"));
//		System.out.println(res.jsonPath().getString("_meta.features[0]"));
//		
		List <Object>l= res.jsonPath().getList("_meta.features");
		System.out.println(l);
		
		System.out.println(l.get(0));
//		
	}
}
