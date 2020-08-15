package services;

import static io.restassured.RestAssured.given;

import configuration.RequestSpecificationBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.HttpResponseException;
import org.apache.http.HttpStatus;

public class RegisterUnsuccessfulService {

  public Response registerUnsuccessful() {
    RequestSpecification spec = new RequestSpecificationBuilder()
        .contentTypeHeader()
        .baseUri("https://reqres.in/api")
        .build();

    Response response = given()
        .spec(spec)
        .body("")
        .post("/register");

    if (response.statusCode() != HttpStatus.SC_OK) {
      throw new HttpResponseException(response);
    }

    return response
        .then()
        .statusCode(HttpStatus.SC_OK)
        .extract()
        .response();
  }
}
