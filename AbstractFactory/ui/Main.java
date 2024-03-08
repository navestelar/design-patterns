package AbstractFactory.ui;

public class Main {
  public static void main(String[] args) {
    AbstractFactory factory = FactoryProducer.getFactory("WINDOWS");

    Button button = factory.createButton();
    Panel panel = factory.createPanel();

    button.paint();
    panel.paint();

    factory = FactoryProducer.getFactory("MAC");
    button = factory.createButton();
    panel = factory.createPanel();

    button.paint();
    panel.paint();
  }
}
