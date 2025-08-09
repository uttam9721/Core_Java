public class Counter {
    public static void main(String[] args) {
        int a= 1;
        int num =25;
        int count =0;
        while (a<=num/2) {
           if (num%a==0) {
             count++;
           }
           a++;
            
        }
        System.out.println(count);
    }
    
}
