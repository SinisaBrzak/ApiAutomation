package clients;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import services.DeleteUserService;

public class DeleteUserClient {

  DeleteUserService service;

  public DeleteUserClient() {
    this.service = new DeleteUserService();
  }

  public void deleteUser() {
    Response response = service.deleteUser();

    assertEquals(HttpStatus.SC_NO_CONTENT, response.getStatusCode(),
        "Status code is not: " + HttpStatus.SC_NO_CONTENT);
  }
}
