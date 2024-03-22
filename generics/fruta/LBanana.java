import java.util.ArrayList;
import java.util.List;

public class LBanana {
  public static void main(String[] args) {
    List<Banana> list = new ArrayList<Banana>();
    Banana banana = new Banana("Branca", "Brasil");
    list.add(banana);
    Banana banana1 = list.get(0);
    System.out.println(banana1.toString());
  }
}
