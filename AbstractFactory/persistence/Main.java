package AbstractFactory.persistence;

public class Main {
  public static void main(String[] args) {
    PersistenceFactory factory = new PersistenceFactoryImpl();

    DataPersistence databasePersistence = factory.createDatabasePersistence();
    databasePersistence.save("Dados para banco de dados");
    databasePersistence.load();

    DataPersistence jsonPersistence = factory.createJsonPersistence();
    jsonPersistence.save("Dados para JSON");
    jsonPersistence.load();
  }
}