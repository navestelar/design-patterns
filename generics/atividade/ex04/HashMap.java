package ex04;

import java.util.ArrayList;
import java.util.List;

public class HashMap<T> {
  private List<String> keys = new ArrayList<String>();
  private List<T> values = new ArrayList<T>();

  public boolean add(String key, T value) {
    if (keys.contains(key)) {
      return false;
    }

    keys.add(key);
    values.add(value);
    return true;
  }

  public boolean delete(String key) {
    if (keys.contains(key)) {
      values.remove(keys.indexOf(key));
      keys.remove(key);
      return true;
    }
    return false;
  }

  public HashMapItem<T> get(String key) {
    if (keys.contains(key)) {
      T value = values.get(keys.indexOf(key));
      HashMapItem<T> item = new HashMapItem<T>(key, value);
      return item;
    }

    return null;
  }

  public void showMap() {
    for (String key : keys) {
      System.out.println(get(key).toString());
    }
  }
}
