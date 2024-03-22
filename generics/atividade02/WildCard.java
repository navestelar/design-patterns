import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;

public class WildCard {
  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3);
    List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    List<String> strings = List.of("hello", "world", "!");

    imprimirLista(integers);
    imprimirLista(doubles);
    imprimirLista(strings);

    // adicionarNumeros(doubles, 6.0);
    // imprimirLista(doubles);
  
    System.out.println(Calculadora.calcularMedia(doubles));
    System.out.println(Calculadora.calcularMedia(integers));
  }

  public static void imprimirLista(List<?> lista) {
    for (Object o : lista) {
      System.err.print(o + " ");
    }
    System.out.println();
  }

  public static void adicionarNumeros(List<? extends Number> lista, Number novoNumero) {
    lista.add(novoNumero);
  }
}