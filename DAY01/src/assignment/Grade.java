package assignment;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		
		System.out.print("Please enter score:");
		Scanner sc= new Scanner(System.in);
		int score = sc.nextInt();
		char grade;
		
		if (score >= 90)
	      {
	         grade = 'A';
	      }
	      else if (score >= 80)
	      {
	         grade = 'B';
	      }
	      else if (score >= 70)
	      {
	         grade = 'C';
	      }
	      else if (score >= 50)
	      {
	         grade = 'D';
	      }
	      else
	      {
	         grade = 'F';
	      }

	      // Display the grade.
	      System.out.println("Your grade is " + grade);
	}

}
