package ex03;

public class Main {
  public static void main(String[] args) {
    Pedido<ProdutoX> lista = new Pedido<ProdutoX>();

    Banana b1 = new Banana(1, "banana nanica", 5.99f, "nanica");
    Banana b2 = new Banana(2, "banana caturra", 7.99f, "caturra");
    Maca m1 = new Maca(3, "maçã br", 10,true);
    Maca m2 = new Maca(3, "maçã gringa", 10,false);
    lista.adicionarProduto(m1);
    lista.adicionarProduto(m2);
    lista.adicionarProduto(b1);
    lista.adicionarProduto(b2);
  }
}
