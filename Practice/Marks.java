package Practice;

public class Marks {
    public static void main(String[] args) {
       int marks = 79;
		if(marks>=0 && marks <=60)
		System.out.println("the grade is F");
		else if (marks>=61 && marks <=70)
			System.out.println("the grade is E");
		else if (marks>=61 && marks <=70)
			System.out.println("the grade is D");
		else if (marks>=71 && marks <=80)
			System.out.println("the grade is C");
		else if (marks>=81 && marks <=90)
			System.out.println("the grade is B");
		else if(marks>=91 && marks <=100)
			System.out.println("A");
		else
			System.out.println("no. is out of maximum marks");
    }
    
}
