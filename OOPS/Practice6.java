class Person{
    void walk(){
        System.out.println("Walking");
    }
}

class Student extends Person{
    void study(){
        System.out.println("Studying");
    }
}

public class Practice6{
    public static void main(String[] args){

        Student s = new Student();

        s.walk();
        s.study();
    }
}