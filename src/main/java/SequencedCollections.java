import java.util.List;

public class SequencedCollections {
  public static void main(String[] args) {
    var arrayList = List.of(1, 2, 3, 4, 5);

    // Antes - Java 17
    var lastItemBefore = arrayList.get(arrayList.size() - 1);

    // Depois - Java 21
    var lastItemAfter = arrayList.getLast();

    System.out.printf("Last: %d, %d%n", lastItemBefore, lastItemAfter);
  }
}
