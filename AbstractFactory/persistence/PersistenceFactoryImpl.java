package AbstractFactory.persistence;

public class PersistenceFactoryImpl implements PersistenceFactory {
  @Override
  public DataPersistence createDatabasePersistence() {
      return new DatabasePersistence();
  }

  @Override
  public DataPersistence createJsonPersistence() {
      return new JsonPersistence();
  }
}