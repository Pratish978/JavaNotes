class GrandParent{
    void house(){
        System.out.println("House");
    }
}

class Parent extends GrandParent{
    void car(){
        System.out.println("Car");
    }
}

class Child extends Parent{
    void bike(){
        System.out.println("Bike");
    }
}

public class Practice7{
    public static void main(String[] args){

        Child c = new Child();

        c.house();
        c.car();
        c.bike();
    }
}