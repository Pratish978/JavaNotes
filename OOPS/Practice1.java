class Employee{
    String name;
    int salary;

    void show(){
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Practice1{
    public static void main(String[] args){

        Employee e1 = new Employee();

        e1.name = "Pratish";
        e1.salary = 25000;

        e1.show();
    }
}