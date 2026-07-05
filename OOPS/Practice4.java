class Employee{

    private int salary;

    public void setSalary(int s){

        if(s > 0){
            salary = s;
        }

    }

    public int getSalary(){
        return salary;
    }

}

public class Practice4{
    public static void main(String[] args){

        Employee e1 = new Employee();

        e1.setSalary(25000);

        System.out.println(e1.getSalary());

    }
}