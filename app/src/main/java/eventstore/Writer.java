/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package eventstore;

import com.eventstore.dbclient.*;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class Writer {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    EventStoreDBClientSettings setts =
        EventStoreDBConnectionString.parseOrThrow("esdb://localhost:2113?tls=false");

    EventStoreDBClient client = EventStoreDBClient.create(setts);

    AccountCreated createdEvent = new AccountCreated();

    createdEvent.setId(UUID.randomUUID());
    createdEvent.setName("Event Created");

    EventData event = EventData.builderAsJson("account-created", createdEvent).build();

    WriteResult writeResult = client.appendToStream("accounts", event).get();

    System.out.println("WriteResult " + writeResult);
  }
}
