package GMIOwn.StepDefinitions;

import GMIOwn.Utilities.ConfigurationReader;
import GMIOwn.pojos.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class US20ReadingAllCustomerSteps {
    Response response;
    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String api_end_point) {
        response=given().headers(
                "Authorization","Bearer "+ ConfigurationReader.getProperty("Token"),
                "Content_Type", ContentType.JSON)  //"Accept", ContentType.JSON
                .when().get(api_end_point)
                .then().contentType(ContentType.JSON).extract().response();
       //  response.prettyPrint();


    }

    @Given("read all Customer and sets create pojo class")
    public void read_all_Customer_and_sets_create_pojo_class() throws IOException {

       ObjectMapper objectMapper=new ObjectMapper();
         Customer[] customer;
        customer = objectMapper.readValue(response.asString(),Customer[].class);

        for (int i = 0; i < customer.length ; i++) {
            if(customer[i]!=null){
               System.out.println(customer[i].getUser().getFirstName());
            }

        }

     //System.out.println(customer[1].getId());//114351

        JsonPath jsonpath=response.jsonPath();

        List<Map<String,?>> customer1;
        customer1 = jsonpath.getList("Customer");

        for (Map<String,?> customers:customer1){

            //System.out.println(customers+" customers");
        }
        String lastName=jsonpath.getString("customer[1].id");
        System.out.println("lastName = " + lastName);



    }

    @Then("Validate All Customer data")
    public void validate_All_Customer_data() {

    }


}
