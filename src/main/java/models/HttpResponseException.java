package models;

import io.restassured.response.Response;

public class HttpResponseException extends RuntimeException {

  private final int statusCode;
  private final String error;

  public HttpResponseException(Response response) {
    this.statusCode = response.getStatusCode();
    this.error = response.jsonPath().get("error");
  }

  public HttpResponseException(int statusCode, String error) {
    super(String.format("Unexpected status code: %s", statusCode));
    this.statusCode = statusCode;
    this.error = error;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getError() {
    return error;
  }
}
