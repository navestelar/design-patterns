package ex03;

public class ProdutoX {
  private Integer id;
  private String nome;
  private float valor;
  public ProdutoX(Integer id, String nome, float valor) {
    this.id = id;
    this.nome = nome;
    this.valor = valor;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public float getValor() {
    return valor;
  }
  public void setValor(float valor) {
    this.valor = valor;
  }
  @Override
  public String toString() {
    return "ProdutoX [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
  }
}