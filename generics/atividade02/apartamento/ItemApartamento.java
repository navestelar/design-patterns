package apartamento;
public class ItemApartamento<T> {
  private String nome;
  private T value;

  public ItemApartamento(String nome, T value) {
    this.nome = nome;
    this.value = value;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public T getValue() {
    return value;
  }
  public void setValue(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ItemApartamento [nome=" + nome + ", value=" + value + "]";
  }
}
