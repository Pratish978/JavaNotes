class Student{

    String name;

    Student(String name){
        this.name = name;
    }

    void show(){
        System.out.println(name);
    }
}

public class Practice11{

    public static void main(String[] args){

        Student s1 = new Student("Pratish");

        s1.show();
    }
}