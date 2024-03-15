package AbstractFactory.ui;

public class WindowsFactory extends AbstractFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Panel createPanel() {
    return new WindowsPanel();
  }
}