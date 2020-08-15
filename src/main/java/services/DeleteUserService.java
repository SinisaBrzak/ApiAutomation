package services;

import static io.restassured.RestAssured.given;

import configuration.RequestSpecificationBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;

public class DeleteUserService {

  public Response deleteUser() {
    RequestSpecification spec = new RequestSpecificationBuilder()
        .acceptHeader()
        .baseUri("https://reqres.in/api")
        .build();

    Response response = given()
        .spec(spec).log().all()
        .delete("/users/2");

    return response.then().statusCode(HttpStatus.SC_NO_CONTENT).extract().response();
  }
}
