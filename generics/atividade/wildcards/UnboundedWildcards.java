package wildcards;

import java.util.List;

public class UnboundedWildcards {
  public static void main(String[] args) {
    List<String> strings = List.of("hello", "world", "!");

    printList(strings);

    boolean empty = isEmpty(strings);
    System.out.println("List is empty: " + empty);

    int size = getSize(strings);
    System.out.println("List size: " + size);

    boolean containsHello = contains(strings, "hello");
    System.out.println("List contains 'hello': " + containsHello);
  }

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }

  public static boolean isEmpty(List<?> list) {
    return list.isEmpty();
  }

  public static int getSize(List<?> list) {
    return list.size();
  }

  public static boolean contains(List<?> list, Object obj) {
    return list.contains(obj);
  }
}
