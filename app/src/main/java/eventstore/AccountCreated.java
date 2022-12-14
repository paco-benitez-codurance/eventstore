package eventstore;

import java.util.UUID;

public class AccountCreated {
  private UUID id;
  private String name;

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "AccountCreated{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}
