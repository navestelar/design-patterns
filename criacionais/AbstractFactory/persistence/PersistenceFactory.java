package AbstractFactory.persistence;

public interface PersistenceFactory {
  DataPersistence createDatabasePersistence();
  DataPersistence createJsonPersistence();
}