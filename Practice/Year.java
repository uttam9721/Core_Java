// 6. Write a program to check if a year is a leap year or not.
package Practice;

public class Year {
    public static void main(String[] args) {
        int n =2024;
        if ((n%4==0 && n%100!=0) || (n%400==0)) {
            System.out.println("Leap Year..");
            
        }else{
            System.out.println("Not a leap year...");
        }
    }
    
}
