package services;

import static io.restassured.RestAssured.given;

import configuration.RequestSpecificationBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Users;
import org.apache.http.HttpStatus;

public class UsersService {

  public Users getUsersList() {

    RequestSpecification spec = new RequestSpecificationBuilder()
        .contentTypeHeader()
        .baseUri("https://reqres.in/api")
        .build();

    Response response = given()
        .spec(spec)
        .get("/users");

    return response.then().statusCode(HttpStatus.SC_OK).extract().response().as(Users.class);
  }

  public Users getUsersListDelayed() {
    RequestSpecification spec = new RequestSpecificationBuilder()
        .contentTypeHeader()
        .baseUri("https://reqres.in/api")
        .build();

    Response response = given()
        .spec(spec)
        .get("/users?delay=5");

    return response.then().statusCode(HttpStatus.SC_OK).extract().response().as(Users.class);
  }
}
