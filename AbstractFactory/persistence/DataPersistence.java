package AbstractFactory.persistence;

public interface DataPersistence {
  void save(String data);
  String load();
}