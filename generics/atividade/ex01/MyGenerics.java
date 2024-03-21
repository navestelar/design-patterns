public class MyGenerics<T> {
  private T dado;

  public MyGenerics(T dado) {
    this.dado = dado;
  }

  public T getDado() {
    return dado;
  }
}
