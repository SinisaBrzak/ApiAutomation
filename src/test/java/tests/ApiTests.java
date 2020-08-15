package tests;

import clients.DeleteUserClient;
import clients.RegisterUnsuccessfulClient;
import clients.UsersClient;
import org.junit.jupiter.api.Test;

public class ApiTests {

  UsersClient client = new UsersClient();
  RegisterUnsuccessfulClient regClient = new RegisterUnsuccessfulClient();
  DeleteUserClient delClient = new DeleteUserClient();

  @Test
  public void getListOfUsersAndVerifyTheyAreNotNull() {
    client.getListOfUsers();
  }

  @Test
  public void unsuccessfulRegistrationVerifyResponseCodeAndErrorMessage() {
    regClient.unsuccessfulRegistration();
  }

  @Test
  public void deleteUserAndVerifyResponseCode() {
    delClient.deleteUser();
  }

  @Test
  public void getListOfUsersAfterDelayedResponse() {
    client.getListOfUsersDelayed();
  }
}
