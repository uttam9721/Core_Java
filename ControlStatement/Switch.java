import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Choice :");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Cod");
            break;
            case 2: System.out.println("card");
            break;
            case 3: System.out.println("upi");
            break;
            case 4: System.out.println("netbanking");
            break;
            default:System.out.println("Are you made");
        }
    }
    
}
