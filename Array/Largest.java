package Array;

public class Largest {
    public static void main(String[] args) {
        int[] arr={12,14,10,17,15,14};
        int large=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (large<arr[i]) {
                large=arr[i]; 
            }
        }
        System.out.println(large);

    }
    
}
