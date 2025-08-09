public class Perfect {
    public static void main(String[] args) {
        int a=1;
        int num=10;
        int sum=0;
        while (a<=num/2) {
            if (num%a==0) {
                sum=sum+a;
            }
            a++;
        }
        if (sum==num) {
            System.out.println(num+"Number perfect "+sum);
            
        }else{
            System.out.println(num+" Number is not perfect "+sum);
        }
        
    }
    
}
