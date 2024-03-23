package assignment;
import java.util.*;
public class calculator {
	
	public static void main (String [] args)
	
	{
		System.out.print("choose an operator '+', '-', '*', '/' :");
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().charAt(0);
		int num1=20, num2 = 10;
		
		switch (ch)
		{
		case '+' :  
			System.out.println(num1+num2);
		case '-' : 
			System.out.println(num1-num2);
		case '*':
			System.out.println(num1*num2);
		case '/' :
			System.out.println(num1/num2);
			
		
		}
	
	}

}
