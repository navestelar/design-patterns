package ex02;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Produto<Integer> produtoIdInteger = new Produto<Integer>(1651, 199.99f, new Date(1672444800000L), new Date(1696444800000L));
    System.out.println(produtoIdInteger.toString());

    Produto<String> produtoIdString = new Produto<String>("josefa", 199.99f, new Date(1672444800000L), new Date(1696444800000L));
    System.out.println(produtoIdString.toString());
  }
}
