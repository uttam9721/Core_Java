package Array;

public class EvenSum {
    public static void main(String[] args) {
        int[] arr={13,10,15,18,16,17};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
    
}
