package AbstractFactory.persistence;

public class JsonPersistence implements DataPersistence {
  @Override
  public void save(String data) {
      System.out.println("Salvando em JSON: " + data);
  }

  @Override
  public String load() {
      return "Dados carregados de JSON";
  }
}