package Prototype;

public class MainTest {
  public static void main(String[] args) {
    Employee originalEmployee = new Employee("John Doe", "IT");
    try {
      Employee clonedEmployee = originalEmployee.clone();
      clonedEmployee.setName("Jane Doe");
      clonedEmployee.setDepartment("HR");
      System.out.println("Original Employee: " + originalEmployee.getName() + ", " + originalEmployee.getDepartment());
      System.out.println("Cloned Employee: " + clonedEmployee.getName() + ", " + clonedEmployee.getDepartment());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    ExpensiveObject originalObject = new ExpensiveObject(123);
    try {
      ExpensiveObject clonedObject = originalObject.clone();
      clonedObject.setData(456);
      System.out.println("Original Object Data: " + originalObject.getData());
      System.out.println("Cloned Object Data: " + clonedObject.getData());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
