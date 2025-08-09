public class Program3 {
    public static void main(String[] args) {
        int val = 12;
        if (val%2==0 && val%3==0) {
            System.out.println("Bangalore");
        }else if (val%2==0) {
            System.out.println("Chennai.");  
        }else if (val%3==0) {
            System.out.println("Hydrabad.");
            
        }else{
            System.out.println("Cochin.");
        }
    }
    
}
