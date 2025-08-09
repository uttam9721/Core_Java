public class Program4 {
    public static void main(String[] args) {
        int age = 3;
        if (age<=3) {
            System.out.println("Free");
        }
        else if(age>3 && age<=10) {
            System.out.println("Half");
        }else if (age>10 && age<60) {
            System.out.println("Full");

            
        }else if (age>=60) {
            
        } else{
            System.out.println("Sr");
        }
    }
    
}
