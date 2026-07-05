class Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{
}

public class Practice5{
    public static void main(String[] args){

        Car c = new Car();

        c.start();
    }
}