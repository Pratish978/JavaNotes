package OOPS;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Pratish";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 23;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}

class Student {

    String name;
    int age;
}