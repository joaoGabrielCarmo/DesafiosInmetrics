import static io.restassured.RestAssured.*;
import org.junit.Test;

public class RestAssuredTest {

    String url = " https://reqres.in/api/users?page=2";    
    @Test
    public void getastatusCode(){

        given().
        		relaxedHTTPSValidation().
                param("page", "2").
        when().
                get(url).
        then().
        		
                statusCode(200);
                
    }
   
}