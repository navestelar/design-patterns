package ex04;

public class HashMapItem<T> {
  private String key;
  private T value;

  public HashMapItem(String key, T value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public T getValue() {
    return value;
  }
  public void setValue(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "HashMapItem [key=" + key + ", value=" + getValue() + "]";
  }
}
