package Lesson9;
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
public class Palindrome {
private String text;
private String palindromeMessage;

public Palindrome () {
	text = "";
	palindromeMessage = "";
} //end constructor with default values

//setter
public void setText (String text) {
	this.text = text;
	
}
	//getter
public String getPalindromeMessage () {
	return palindromeMessage;

}

    /*create text reading backwards of the initial string 
	/and then create method that compares both strings 
	/WE NEED SB to be able to modify string in any way - without it NOT possible
	 */
	 	
public void decidePalindrome () {
	StringBuffer sb = new StringBuffer ();
	
	int len = text.length(); // shows numb of characters in the string text

	for (int i = len-1; i >= 0; i--) { 	//traverse text from end to beginning
		
		char c = text.charAt(i); //retrieve one char in each iteration of the loop
		
		sb.append(c); //add each char to the SB
		
	} //end for
	
	// convert mutable version of our word from SB toString() again:
	String reversedText = sb.toString();
	
	//use if else to check if both texts are now ==
	
	if (text.equalsIgnoreCase(reversedText)) {
		palindromeMessage = "The text " + text + " is a PALINDROME! ";
		
	} else {
		palindromeMessage = "The text " + text + " is NOT a PALINDROME! :(";
	} 

} // end if


} //end class
