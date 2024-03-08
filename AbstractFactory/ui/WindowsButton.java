package AbstractFactory.ui;

public class WindowsButton implements Button {
  @Override
  public void paint() {
    System.out.println("Pintando botão do Windows");
  }
}