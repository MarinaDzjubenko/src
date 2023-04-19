package homeworks;

public abstract class Member {
    //Fields
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    //Constructor
    public Member (String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    //Method
     public void printSalary() {
     }
 }

