public class Main {
  public static void main(String[] args) {
    Integer[] l1 = {0,1,2,3,4,5,6,7,8,9,10};
    Integer e1 = 5;
    String[] l2 = {"a", "aa", "aaa", "aaaa", "aaaaa","aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa"};
    String e2 = "aaa";
    int count = Compare.<Integer>countGreaterThan(l1, e1);
    System.out.println(count);
  }
}
