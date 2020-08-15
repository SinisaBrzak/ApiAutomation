package clients;

import static org.awaitility.Awaitility.await;
import static org.awaitility.pollinterval.FibonacciPollInterval.fibonacci;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import models.Users;
import org.awaitility.Duration;
import services.UsersService;

public class UsersClient {

  UsersService service;

  public UsersClient() {
    this.service = new UsersService();
  }

  public void getListOfUsers() {
    Users users = service.getUsersList();

    assertAll(
        () -> assertNotNull(users.getPage(), "The page value is null"),
        () -> assertNotNull(users.getPer_page(), "The per_page value is null"),
        () -> assertNotNull(users.getTotal(), "The total value is null"),
        () -> assertNotNull(users.getTotal_pages(), "The total_pages value is null"),
        () -> assertNotNull(users.getPer_page(), "The per_page value is null"),
        () -> assertNotNull(users.getData(), "The per_page value is null"),
        () -> assertFalse(users.getData().isEmpty(), "The data list is empty"),
        () -> assertNotNull(users.getAd(), "The ad value is null")
    );
  }

  public Users getListOfUsersDelayed() {

    AtomicReference<Users> reference = new AtomicReference<>();
    await()
        .atMost(Duration.TEN_SECONDS)
        .with()
        .pollInterval(fibonacci(TimeUnit.SECONDS))
        .untilAsserted(
            () -> {
              try {
                reference.set(service.getUsersListDelayed());
              } catch (Exception e) {
                System.out.println("The response is not returned");
              }
              assertNotNull(reference.get(), "The request is not returned in specified time");
            }
        );

    assertAll(
        () -> assertNotNull(reference.get().getPage(), "The page value is null"),
        () -> assertNotNull(reference.get().getPer_page(), "The per_page value is null"),
        () -> assertNotNull(reference.get().getTotal(), "The total value is null"),
        () -> assertNotNull(reference.get().getTotal_pages(), "The total_pages value is null"),
        () -> assertNotNull(reference.get().getPer_page(), "The per_page value is null"),
        () -> assertNotNull(reference.get().getData(), "The per_page value is null"),
        () -> assertFalse(reference.get().getData().isEmpty(), "The data list is empty"),
        () -> assertNotNull(reference.get().getAd(), "The ad value is null")
    );

    return reference.get();
  }
}
