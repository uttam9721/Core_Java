package Array;

public class Odd {

    public static void main(String[] args) {
        int[] arr={12,10,15,17,14,13};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
} 
