import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class DemoAPI {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	//	RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/11").then()
	//	.log().all().assertThat().statusCode(200);
		/*RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/658")
		.then().log().all().assertThat().statusCode(200);*/
		
		/*RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/booking/658").then().log().all().assertThat().statusCode(201);
		*/
		
		/*RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("C:\\Users\\Plabani\\eclipse-workspace\\API_Testing\\src\\test\\resources\\CreateBooking.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("/booking").then().log().all();
		
		
		/*.body(getFileContent("src//test//resources//requests//CreateBooking.txt"))
		.header("Content-Type", "application/json").header("Accept", "application/json").when().log().all()
		.post("/booking").then().log().all().assertThat().statusCode(200);
		
		
		

	}*/
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("C:\\Users\\Plabani\\eclipse-workspace\\API_Testing\\src\\test\\resources\\CreateBooking1.txt"))
		.header("Accept","application/json").header("Content-Type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").
		when().log().all().put("/booking/1660").then().log().all();
		
		
	}

		public static String getFileContent(String filePath) throws FileNotFoundException 
		{
			File file = new File(filePath);
			Scanner sc = new Scanner(file);
			sc.useDelimiter("\\Z");
			return sc.next();

}

	}