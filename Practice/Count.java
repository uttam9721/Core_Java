// package Practice;

// public class Count {
//     static void oddNum(int n,int i){
//         int count=0;
//         while (i<=n) {
//             if (i%2!=0) {
//                 count++;
//             }
//             i++;
            
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         int n =15;
//         int i=1;
//         oddNum(n, i);
//     }
    
// }


package Practice;

public class Count {

    public static void main(String[] args) {
        int[] arr={5,2,3,4,6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
        System.out.println(max);
    }
}