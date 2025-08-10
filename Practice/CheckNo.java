// 9. Write a program to classify a number as positive, negative, or zero.
package Practice;

public class CheckNo {

    public static void main(String[] args) {
        int num=10;
        if (num>0) {
            System.out.println("Positive");
            
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
        
    }
}