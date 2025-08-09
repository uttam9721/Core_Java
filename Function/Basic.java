package Function;

public class Basic {
    static boolean verify(int arg){
        if (arg%2==0) {
            return true;
            
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean val = verify(10);
        System.out.println(val);
    }
    
}
