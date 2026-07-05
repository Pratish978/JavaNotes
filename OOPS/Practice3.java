class Employee{

    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}

public class Practice3{
    public static void main(String[] args){

        Employee e1 = new Employee();

        e1.setName("Pratish");

        System.out.println(e1.getName());

    }
}