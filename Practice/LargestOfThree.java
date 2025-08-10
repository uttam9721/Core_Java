//  5. Write a program to find the largest of three numbers using if-else-if.

package Practice;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 100;
        int b =20;
        int c = 30;
        if (a>b && a>c) {
            System.out.println("A");
            
        }else if(b>c){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
    }
    
}
