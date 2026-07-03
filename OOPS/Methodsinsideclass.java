package OOPS;

public class Methodsinsideclass {
    public static void main(String[] args) {

    //Object creation
    Student s1 = new Student();

     s1.name = "Pratish";

    s1.study();
    }
    }

    //Method inside class
    class Student {

    String name;

    void study() {
        System.out.println(name + " is studying");
    }

}
