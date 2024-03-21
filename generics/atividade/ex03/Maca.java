package ex03;

public class Maca extends ProdutoX {
  private boolean isBrasilian;

  public Maca(Integer id, String nome, float valor, boolean isBrasilian) {
    super(id, nome, valor);
    this.isBrasilian = isBrasilian;
  }

  public boolean isBrasilian() {
    return isBrasilian;
  }

  public void setBrasilian(boolean isBrasilian) {
    this.isBrasilian = isBrasilian;
  }

  @Override
  public String toString() {
    return "Maca [isBrasilian=" + isBrasilian + "]";
  }

}
