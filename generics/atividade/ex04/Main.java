package ex04;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer> map = new HashMap<Integer>();

    System.out.println(map.add("a",1));
    System.out.println(map.add("a",1));

    System.out.println(map.get("a").toString());

    System.out.println(map.add("b",2));
    System.out.println(map.add("c",3));

    map.showMap();

    System.out.println(map.delete("a"));
    System.out.println(map.delete("a"));

    map.showMap();
  }
}
