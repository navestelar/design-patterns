package ex03;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {
  private List<ProdutoX> listaProdutos = new ArrayList<ProdutoX>();

  public void adicionarProduto(T produto) {
    listaProdutos.add(produto);
  }

  public List<ProdutoX> mostrarLista() {
    for (ProdutoX produto : listaProdutos) {
      System.out.println(produto.toString());
    }

    return listaProdutos;
  }
}
