package FluenteInterface;

public class Calculator {
  private int result = 0;

  public Calculator add(int value) {
    result += value;
    return this;
  }

  public Calculator subtract(int value) {
    result -= value;
    return this;
  }

  public Calculator multiply(int value) {
    result *= value;
    return this;
  }

  public Calculator divide(int value) {
    if (value != 0) {
      result /= value;
    } else {
      throw new IllegalArgumentException("Divisão por zero não é permitida.");
    }
    return this;
  }

  public int result() {
    return result;
  }
}