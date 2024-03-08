package AbstractFactory.ui;

public class MacFactory extends AbstractFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public Panel createPanel() {
    return new MacPanel();
  }
}
