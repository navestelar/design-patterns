package builder;

import builder.Computer.ComputerBuilder;

public class Main {
  public static void main(String[] args) {
    ComputerBuilder computerBuilder = new ComputerBuilder("500GB", "8GB");
    computerBuilder.setGraphicsCardEnabled(true);
    computerBuilder.setBluetoothEnabled(true);
    Computer computer = computerBuilder.build();

    System.out.println("Computer Configuration:");
    System.out.println("HDD: " + computer.getHDD());
    System.out.println("RAM: " + computer.getRAM());
    System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
    System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled());

    HtmlBuilder htmlBuilder = new HtmlBuilder();
    htmlBuilder.openTag("html")
        .openTag("body")
        .openTag("h1").text("Hello, World!").closeTag("h1")
        .closeTag("body")
        .closeTag("html");
    String html = htmlBuilder.build();

    System.out.println("\nGenerated HTML:");
    System.out.println(html);
  }
}
