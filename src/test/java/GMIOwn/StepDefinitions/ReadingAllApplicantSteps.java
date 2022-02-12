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

import static io.restassured.RestAssured.given;


public class ReadingAllApplicantSteps {  //https://www.gmibank.com/api/tp-customers
    Response response;
    @Given("user go to api end point  {string}")
    public void user_go_to_api_end_point(String api_end_point) {
        response=given().headers(
                "Authorization","Bearer "+ ConfigurationReader.getProperty("Token"),
                "Content_Type", ContentType.JSON)  //"Accept", ContentType.JSON
                .when().get(api_end_point)
                .then().contentType(ContentType.JSON).extract().response();
       //response.prettyPrint();



    }

    @Given("read all applicants and sets create pojo class")
    public void read_all_applicants_and_sets_create_pojo_class() throws IOException {

        JsonPath jsonpath=response.jsonPath();
        List<Map<String,?>> applicant= jsonpath.getList("");
        //System.out.println(applicant+" applicant");

        for (Map<String,?> applicants:applicant){
           System.out.println(applicants+" applicants");
        }
        String lastName=jsonpath.getString("applicant.lastName");
        System.out.println("lastName = " + lastName);



        //java diline ceviriyrz daha rahat islem yapabilmek icn
        ObjectMapper objectMapper=new ObjectMapper();
       // List<Map<String,?>> applicant2=objectMapper.readValue(response.asString(),Class.List<Map<String,?>>);
//        System.out.println(customer[1].getId());
    }

    @Then("Validate data")
    public void validate_data() {

    }
}
