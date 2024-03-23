package assignment;
import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
	
		System.out.print("Please enter number: ");
		Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        //Write your logic here
        
        if (day > 7 && day <0)
        {
            System.out.println("Please enter valid day");
        }
        else {
        switch (day)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            
            
        }
        }
	
}}
