package clients;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import models.HttpResponseException;
import org.apache.http.HttpStatus;
import services.RegisterUnsuccessfulService;

public class RegisterUnsuccessfulClient {

  RegisterUnsuccessfulService service;

  public RegisterUnsuccessfulClient() {
    service = new RegisterUnsuccessfulService();
  }

  public void unsuccessfulRegistration() {

    HttpResponseException error =
        assertThrows(HttpResponseException.class,
            () -> service.registerUnsuccessful(),
            "No error message is thrown for unsuccessful registration request");

    assertAll(
        () -> assertEquals(HttpStatus.SC_BAD_REQUEST, error.getStatusCode(),
            "Status code is not: " + HttpStatus.SC_BAD_REQUEST),
        () -> assertEquals("Missing email or username", error.getError(), "Invalid error message")
    );
  }
}
