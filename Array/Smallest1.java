public class Smallest1 {
    public static void main(String[] args) {
        int arr[]={10,5,6,4,8,9,7,45};
            int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<small) {
                small=arr[i];
            }
            
        }
        System.out.println(small);
    }
}
