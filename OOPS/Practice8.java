class Employee{

    void work(){
        System.out.println("Employee Working");
    }
}

class Developer extends Employee{

    void work(){
        System.out.println("Writing Code");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}