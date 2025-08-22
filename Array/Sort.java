package Array;

public class Sort {
    public static void main(String[] args) {
         int arr[] = {5, 2, 9, 1, 6, 3};
         for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            if (arr[i]>arr[j]) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp; 
            }
            
           }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    
}
}
