package Function;

public class Delta {
    static void factorial(int n,int fact){
        
       if(n>=1) {
            fact=fact*n;
            n--;
            factorial(n, fact);
        }else{
            System.out.println(fact);
        }
    }
    public static void main(String[] args) {
        factorial(5, 1);
    }
    
}
