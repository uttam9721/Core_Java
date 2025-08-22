package Array;

public class Reverse1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int first = 0;
        int end = arr.length - 1;

        // Use while loop for full reversal
        while (first < end) {
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;

            first++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
