package Array;

public class LinearSearch {
    // Function to search element
    static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // ✅ return index instead of key
            }
        }
        return -1;  // if not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 6, 9, 8, 7, 3};
        int key = 6;

        int ans = linear(arr, key);

        if (ans == -1) {
            System.out.println("Key is not found...");
        } else {
            System.out.println("Key " + key + " found at index: " + ans);
        }
    }
}
