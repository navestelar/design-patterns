package Prototype;

public class ExpensiveObject implements Cloneable {
    private int data;

    public ExpensiveObject(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    @Override
    public ExpensiveObject clone() throws CloneNotSupportedException {
        return (ExpensiveObject) super.clone();
    }
}