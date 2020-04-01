package Lesson9;
/** 
Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behavior by implementing a method (i.e. displayMe())
*/
//inst class
public class Person {

	//declare instance variables 
	private String name;
	private int age;
	private boolean enjoysReading;
	
	
	
	//constructors as we know cannot be the same - we have to create different (with + / - values etc.)
	
	public Person () {} //default constructor is empty and gives our variables default value
	
	
	public Person (String name) { // constructor with 1 parameter - name
		this.name = name;
	}
	
	public Person (String name, int age) {  //constr. with 2 params
		this.name = name;
		this.age = age;
	}

	
	public Person (String name, int age, boolean enjoysReading) { //with all 3 params
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	
	
	public Person (boolean enjoysReading, String name, int age) { //with all 3 params but different order
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
		
	public void displayMe() {
		System.out.println ("Person's name: " + name);
		System.out.println ("Person's age: " + age);
		System.out.println ("Person enjoys reading: " + enjoysReading);
		System.out.println ("_______________________");
		
	}

	
	public void setAge(int age) {
		this.age = age;
	}


	public boolean isEnjoysReading() {
		return enjoysReading;
	}
		
	
	
} //end class
