package OOPS;

// 1. This class defines the "blueprint" for an Employee
class EmployeeDetails {
    String name;
    int salary;
}

// 2. This class runs your program
public class Employee {
    public static void main(String[] args) {
        // Create an instance of EmployeeDetails
        EmployeeDetails E1 = new EmployeeDetails();

        E1.name = "Pratish";
        E1.salary = 22000;

        System.out.println(E1.name);
        System.out.println(E1.salary);
    }
}