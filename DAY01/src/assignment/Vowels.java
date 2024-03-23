package assignment;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int i=0;
		System.out.print("enter character: ");
		Scanner in = new Scanner(System.in);
		char ch=in.next( ).charAt(0);	 
		//char ch=sc.nextChar();
		switch(ch)
    {
	 case 'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Entered character "+ch+" is  Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonent");
		else
		System.out.println("Not an alphabet");	
	
	
	
	
	
	
	}

}
