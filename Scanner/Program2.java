package Scanner;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        double num1 =sc.nextDouble();
        System.out.println("Enter the num2");
        double num2 =sc.nextDouble();
        double sum = num1+num2;
        System.out.println(sum);
    }
    
}
