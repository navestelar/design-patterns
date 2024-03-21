package wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    List<? super Integer> superIntegers = integers;
    List<? extends Integer> extendsIntegers = integers;

    addIntegers(superIntegers);
    // addIntegers(extendsIntegers);

    System.out.println("Super Integers: " + superIntegers);
    System.out.println("Extends Integers: " + extendsIntegers);

    List<Number> numbers = new ArrayList<>();
    List<? super Number> superNumbers = numbers;
    List<? extends Number> extendsNumbers = numbers;

    addNumbers(superNumbers);
    // addNumbers(extendsNumbers);

    System.out.println("Super Numbers: " + superNumbers);
    System.out.println("Extends Numbers: " + extendsNumbers);

    List<Object> objects = new ArrayList<>();
    List<? super Object> superObjects = objects;
    List<? extends Object> extendsObjects = objects;

    addObjects(superObjects);
    // addObjects(extendsObjects);

    System.out.println("Super Objects: " + superObjects);
    System.out.println("Extends Objects: " + extendsObjects);

    List<String> strings = new ArrayList<>();
    List<? super String> superStrings = strings;
    List<? extends String> extendsStrings = strings;

    addStrings(superStrings);
    // addStrings(extendsStrings);

    System.out.println("Super Strings: " + superStrings);
    System.out.println("Extends Strings: " + extendsStrings);
  }

  public static void addIntegers(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    }
  }

  public static void addNumbers(List<? super Number> list) {
    list.add(1);
    list.add(2.0);
    list.add(3L);
  }

  public static void addObjects(List<? super Object> list) {
    list.add("Hello");
    list.add(123);
    list.add(new Object());
  }

  public static void addStrings(List<? super String> list) {
    list.add("Java");
    list.add("Python");
    list.add("C++");
  }
}
