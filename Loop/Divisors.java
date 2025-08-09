public class Divisors {
    public static void main(String[] args) {
        int  a=1;
        int num= 10;
        int sum=0;
        while (a<=num/2) {
            if (num%a==0) {
                sum=sum+a;
                
            }
            a++;
            
        }
        System.out.println(sum);
    }
}

// public class Divisors {

//     public static void main(String[] args) {
//         int num=12;
//         int a =1;
//         int sum=0;
//         while (a<=num/2) {
//             if (num%a==0) {
//                 sum=sum+a;
                
//             }
//             a++;
            
//         }
//         System.out.println(sum);
//     }
// }