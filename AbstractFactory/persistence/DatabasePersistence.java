package AbstractFactory.persistence;

public class DatabasePersistence implements DataPersistence {
  @Override
  public void save(String data) {
    System.out.println("Salvando no banco de dados: " + data);
  }

  @Override
  public String load() {
    return "Dados carregados do banco de dados";
  }
}