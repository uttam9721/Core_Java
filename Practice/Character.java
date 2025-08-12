// 11. Write a program to check whether a character is uppercase or lowercase.

package Practice;

public class Character {
    public static void main(String[] args) {
        char ch ='A';
        if (ch>='A' && ch<='Z') {
            System.out.println("Upper"); 
        }else{
            System.out.println("Lower");
        }
    }
    
}
