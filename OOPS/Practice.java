class Student{
    String name;
    int marks;
}

public class Practice{
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Pratish";
        s1.marks = 95;

        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
}