// // package Function;

// // import java.util.*;

// // public class Practice {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number of n: ");
// //         int n = sc.nextInt();
// //         int sum =0;
// //         int digit =0;
// //         while (n>0) {
// //             n=n/10;
// //             // digit++;
// //             sum=sum+n;
// //         }
// //         System.out.print(sum+" ");
// //     }
    
// // }


// package Function;

// public class Practice {

//     public static void main(String[] args) {
//         int i=1;
//         int n =123456789;
//         int count=0;
//         while (i<=n/2) {
//             if (n%i==0) {
//                 count++;
                
//             }
//             i++;
//         }
//         System.out.println(count);
//     }
// }

package Function;

public class Practice {

    public static void main(String[] args) {
        int n=153;
        int sum = 0;
        while (n!=0) {
            // int digit = n%10;
            // sum = sum+digit;
            n=n/10;
            sum++;

            
        }
        System.out.println(sum);
    }
}