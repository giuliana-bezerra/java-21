public class UnnamedPatternsAndVariables {
  public static void main(String[] args) {
    try {
      task();
    } catch (Exception _) {
      System.out.println("Error!");
    }
  }

  public static void task() {
    throw new RuntimeException("Exception!");
  }
}
