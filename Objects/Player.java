public class Player {
     String name;
        int jerseyNumber;
        void play(){
            System.out.println(name+" is playing "+jerseyNumber);
        }
    public static void main(String[] args) {
        Player p1 =new Player();
        p1.name="Rohit";
        p1.jerseyNumber=45;
        p1.play();
        System.out.println("=========================");
        
        Player p2 =new Player();
        p2.name="KL Rahul";
        p2.jerseyNumber=01;
        p2.play();
        System.out.println("=========================");
    }
}
