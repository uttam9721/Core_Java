public class Mobile {
    String model;
    double price;
    void call(){
        System.out.println(model+" calling.......................");
    }
    void msg(){
        System.out.println(model+"  message.....................");
    }
    public static void main(String[] args) {
        Mobile m1 =new Mobile();
        m1.model="Iphone";
        m1.price=100000;
        m1.call();
        m1.msg();
        System.out.println("=============================");
         Mobile m2 =new Mobile();
        m2.model="Samsung";
        m2.price=200000;
        m2.call();
        m2.msg();

    }
    
}

