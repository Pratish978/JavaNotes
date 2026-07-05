abstract class Animal{

    void eat(){
        System.out.println("Eating");
    }

    abstract void sound();
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Practice9{
    public static void main(String[] args){

        Dog d = new Dog();

        d.eat();

        d.sound();
    }
}