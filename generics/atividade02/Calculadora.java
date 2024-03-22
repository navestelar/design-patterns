import java.util.List;

public abstract class Calculadora {
  public static double calcularMedia(List<? extends Number> numbers) {
    double sum = 0;
    for (Number number : numbers) {
      sum += number.doubleValue();
    }

    return sum / numbers.size();
  }
}
