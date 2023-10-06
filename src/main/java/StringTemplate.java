public class StringTemplate {
  public static void main(String[] args) {
    var name = "Giuliana";

    // Antes - Java 17
    System.out.printf("Olá, %s%n", name);

    // Depois - Java 21
    System.out.println(STR."Olá, \{name}");
  }
}
