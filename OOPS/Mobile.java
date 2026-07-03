package OOPS;

  class mobile{
    String Brand;
    String Price;

    void showDetails(){
        System.out.println(Brand + " " + Price);
    }
  }

public class Mobile {
    public static void main(String[] args) {
        
        mobile m1 = new mobile();
        m1.Brand = "Samsung";
        m1.Price = "20000";
        
        m1.showDetails();
    }
}
