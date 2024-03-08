package AbstractFactory.ui;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("WINDOWS")) {
            return new WindowsFactory();
        } else if (choice.equalsIgnoreCase("MAC")) {
            return new MacFactory();
        }
        return null;
    }
}