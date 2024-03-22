package wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3);
    List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    List<String> strings = List.of("hello", "world", "!");

    printNumbers(integers);
    printNumbers(doubles);
    printStrings(strings);

    System.out.println("Sum of integers: " + sumOfList(integers));
    System.out.println("Sum of doubles: " + sumOfList(doubles));

    System.out.println("Max of integers: " + findMax(integers));
    System.out.println("Max of doubles: " + findMax(doubles));

    printObjects(strings);
    printObjects(integers);
    printObjects(doubles);

    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    addValueAndPrint(integerList);
  }
  public static void addValueAndPrint(List<? extends Number> list) {
    for (int i = 0; i < 2; i++) {
      list.add(i);
    }

    for (Number value : list) {
      System.out.println(value + " ");
    }
  }

  private static void printNumbers(List<? extends Number> numberList) {
    for (Object number : numberList) {
      System.out.println(number);
    }
  }

  public static double sumOfList(List<? extends Number> list) {
    double sum = 0.0;
    for (Number n : list)
      sum += n.doubleValue();
    return sum;
  }

  public static <T extends Comparable<T>> T findMax(List<? extends T> list) {
    T max = list.get(0);
    for (T item : list) {
      if (item.compareTo(max) > 0) {
        max = item;
      }
    }
    return max;
  }

  public static void printStrings(List<? extends String> strings) {
    for (String s : strings) {
      System.out.println(s);
    }
  }

  public static void printObjects(List<? extends Object> objects) {
    for (Object obj : objects) {
      System.out.println(obj.toString());
    }
  }
}
