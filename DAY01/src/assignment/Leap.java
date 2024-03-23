package assignment;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
	    
		System.out.print("Please enter year: ");
		Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        //Write your logic here
        
        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
	
	}

}
