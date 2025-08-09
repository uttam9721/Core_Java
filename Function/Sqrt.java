package Function;

public class Sqrt {
    static int square(int n){
        int sq=n*n;
        return sq;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.print(square(i)+" ");
            
        }
    }
    
}
