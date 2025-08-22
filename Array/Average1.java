package Array;

public class Average1 {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 6, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            
        }
        int avg=sum/arr.length;
        System.out.println(avg);
    }
    
}
