package apartamento;
public class Main {
  public static void main(String[] args) {
      Apartamento<ItemApartamento> meuApartamento = new Apartamento<>();

      meuApartamento.adicionarItem(new ItemApartamento<String>("Sofa", "Sofá"));
      meuApartamento.adicionarItem(new ItemApartamento<Integer>("Mesa de Café", 5));

      meuApartamento.adicionarItem(new ItemApartamento<>("Fogão", null));
      meuApartamento.adicionarItem(new ItemApartamento<Boolean>("Microondas", true));

      meuApartamento.adicionarItem(new ItemApartamento<String>("Pintura na parede", "azul"));

      meuApartamento.listarItens();
  }
}
