package APITesting;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.equalTo;
 
public class Get_All_Products {
  @Test
  public void getallproducts() {
	  RestAssured.baseURI="https://fakestoreapi.com";
	  RestAssured.given()
	  .when()
	  .get("/products/3")
	  .then()
	  .statusCode(200).body("title", equalTo("Mens Cotton Jacket"))
	  .log().all();

  }
}