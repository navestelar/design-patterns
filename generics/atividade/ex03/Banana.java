package ex03;

public class Banana extends ProdutoX {
  private String tipo;

  public Banana(Integer id, String nome, float valor, String tipo) {
    super(id, nome, valor);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return super.toString()+"tipo = "+tipo+";";
  }
  
}
