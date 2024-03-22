package apartamento;
import java.util.ArrayList;
import java.util.List;

public class Apartamento<T> {
  private List<T> itens;

  public Apartamento() {
    itens = new ArrayList<>();
  }

  public void adicionarItem(T item) {
    itens.add(item);
  }

  public List<T> getItens() {
    return itens;
  }

  public void listarItens() {
    for (T item : itens) {
      System.out.println(item);
    }
  }
}
