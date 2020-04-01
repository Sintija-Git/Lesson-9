package Lesson9;
import java.util.Scanner;
/** 
Develop an application which creates multiple objects of type Person class
Store them in an array, retrieve the objects from the array and call different methods on these objects.
*/
public class PersonAppDemo {
	

	public static void main(String[] args) {
		//declare an array of type Person
		Person people[];
		
		
		int n; //to store the number of obj/persons to be created
		
		Scanner sc = new Scanner (System.in);
			System.out.println ("How many persons do you want to create?");
			n = sc.nextInt();
			people = new Person[n];
			
			//local variables to store
			String name;
			int age;
			boolean enjoysReading;	
			
			//for loop to take the users input, in each iteration create an obj of type Person using the given input and store it in array []
			
			for (int i = 0; i< n; i++) {
					System.out.println ("Person's name: ");
					name = sc.next();
					System.out.println ("Person's age: ");
					age = sc.nextInt();
					System.out.println ("Person enjoys reading: ");
					enjoysReading = sc.nextBoolean();
					System.out.println ("*******************");
					System.out.println ();
			
					people[i] = new Person(name, age, enjoysReading); //create an obj of person using constructor with params that allign with it
			} //end for
			
			Person p;
			
			boolean enjoy;
			
			//traverse the array using for loop
			for (int i = 0; i < people.length; i++) {
				//retrieve the Person object located at index i
				p = people[i];
				p.displayMe();
				enjoy = p.isEnjoysReading();
				
				if (enjoy == true) {
					System.out.println ("Enjoys reading!");
					System.out.println();
					
				} else {
					System.out.println ("Hates reading!");
					System.out.println();
				}
			}
			
		
	} //end main

} //end class
