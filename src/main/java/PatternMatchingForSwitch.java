public class PatternMatchingForSwitch {
  public static void main(String[] args) {
    Object obj = new User(
            "giulianabezerra", "123", "email@giulianabezerra");

    // Antes - Java 17
    switch (obj) {
      case User user -> System.out.printf("%s, %s, %s%n",
              user.username(), user.password(), user.email());
      default -> System.out.println("??");
    }

    // Depois - Java 21
    switch (obj) {
      case User(String username, String password, String email) ->
              System.out.printf("%s, %s, %s%n", username, password, email);
      default -> System.out.println("??");
    }
  }
}
