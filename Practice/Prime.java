package Practice;

public class Prime {
    public static void main(String[] args) {
        int num = 12;
    int i =1;
    int counter = 0;
    while(i<=num/2){
        if (num%i==0) {
            counter++;
        }
        i++;
    }
    if (counter==1) {
        System.out.println("Number is Prime");
    }else{
        System.out.println("Number is Not Prime");
    }
    }
    
}
