public class obj {
    String name ="Kohli";

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.name="Rohit";
        System.out.println(p1.name);
        System.out.println(p2.name);

        
    }
    
}
