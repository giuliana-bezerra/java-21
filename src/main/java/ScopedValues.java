public class ScopedValues {
  static final ScopedValue<String> MAIN = ScopedValue.newInstance();

  public static void main(String[] args) {
    ScopedValue.where(MAIN, "Message from the main scope!")
            .run(() -> new Task().execute());
  }
}

class Task {
  public void execute() {
    System.out.println("Task: " + ScopedValues.MAIN.get());
  }
}
