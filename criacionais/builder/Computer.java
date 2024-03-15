package builder;

public class Computer {
  private String HDD;
  private String RAM;
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  private Computer(ComputerBuilder builder) {
    this.HDD = builder.HDD;
    this.RAM = builder.RAM;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  public static class ComputerBuilder {
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled = false;
    private boolean isBluetoothEnabled = false;

    public ComputerBuilder(String hdd, String ram) {
      this.HDD = hdd;
      this.RAM = ram;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }

  public String getHDD() {
    return HDD;
  }

  public Computer setHDD(String hDD) {
    HDD = hDD;
    return this;
  }

  public String getRAM() {
    return RAM;
  }

  public Computer setRAM(String rAM) {
    RAM = rAM;
    return this;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public Computer setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
    this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    return this;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  public Computer setBluetoothEnabled(boolean isBluetoothEnabled) {
    this.isBluetoothEnabled = isBluetoothEnabled;
    return this;
  }
}
