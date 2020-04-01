package Lesson9;
import java.util.Scanner;
/**
A palindrome is a string that reads the same forwards and backwards. For
example, noon and madam are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:
The string is a palindrome.
Otherwise, it should print out the message:
The string is not a palindrome.
The application should make use of instantiable classes.
*/
public class PalindromeApp {
	

	public static void main(String[] args) {
		//local variables to store users input
		String t;
		String m;
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Please enter text: ");
		t = sc.nextLine(); //reads everything till user hits enter
		
		Palindrome pal = new Palindrome ();
		
		pal.setText(t);
		pal.decidePalindrome();
		
		m = pal.getPalindromeMessage();
		System.out.println (m);
		
				

	}

}
