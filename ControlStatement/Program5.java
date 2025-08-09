public class Program5 {
    public static void main(String[] args) {
        double percentage=74;
        if (percentage>=85) {
            System.out.println("Distriction");
        } else if (percentage>=70 && percentage<85) {
            System.out.println("First Class");
        } else if (percentage>=60 && percentage<70) {
            System.out.println("Second class");
            
        }else if (percentage>=35 && percentage<60) {
            System.out.println("PAss");
            
        }else{
            System.out.println("Fail");
        }
    }
    
}
