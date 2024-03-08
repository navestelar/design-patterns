package AbstractFactory.ui;

public class MacButton implements Button {
  @Override
  public void paint() {
    System.out.println("Pintando botão do Mac");
  }
}
