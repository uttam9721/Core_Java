import java.util.Scanner;

public class Callcenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of option..");
        int option = sc.nextInt();
        switch (option) {
            case 1:System.out.println("English");
                break;
            case 2:System.out.println("Hindi");
                break;
            case 3:System.out.println("Bengoli");
                break;
        
            default:System.out.println("Are you series");

        }
    }
    
}
