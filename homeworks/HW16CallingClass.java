package homeworks;

public class HW16CallingClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 45, "4456778", "Street", 1000, "Worker");
        Manager manager = new Manager("Nick", 45, "4345697979", "Street", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();
    }
}


