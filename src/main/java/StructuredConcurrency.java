import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrency {
  public static void main(String[] args) throws InterruptedException {
    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
      StructuredTaskScope.Subtask<String> task1 = scope.fork(() -> task1());
      StructuredTaskScope.Subtask<String> task2 = scope.fork(() -> task2());

      scope.join();
      scope.throwIfFailed(e -> new RuntimeException("Error!"));

      System.out.printf("%s, %s", task1.get(), task2.get());
    }
  }

  public static String task1() {
    return "Task 1";
  }

  public static String task2() {
    return "Task 2";
  }
}
