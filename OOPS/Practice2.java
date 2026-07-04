
class Student{

    String name;//Class variable

    Student(){
        name = "Pratish";//Class constructor
    }

    void display(){
        System.out.println(name);//Class method
    }
}

public class Practice2{

    public static void main(String[] args){

        Student s1 = new Student();//Creating object of class Student

        s1.display();
    }
}