package Array;

public class Smallest {
    public static void main(String[] args) {
        int[] arr={12,14,10,17,15,14};
        int small=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small>arr[i]) {
                small=arr[i]; 
            }
        }
        System.out.println(small);

    }
    
}
