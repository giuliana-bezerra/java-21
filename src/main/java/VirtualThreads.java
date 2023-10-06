import java.util.concurrent.Executors;

public class VirtualThreads {
  public static void main(String[] args) {
    // Thread API
    Thread.startVirtualThread(
            () -> System.out.println("Virtual Thread w/ Thread API"));

    // Executors API
    var executor = Executors.newVirtualThreadPerTaskExecutor();
    executor.submit(() -> System.out.println("Virtual Thread w/ Executors API"));
  }
}