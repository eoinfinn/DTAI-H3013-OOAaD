/** 
Mark Deegan <br>
20231025 1639 <br>
Studebnt class <br>
Sample code to demonstrate class declaration and inheritance (extending classes) <br>
*/
public class Student extends Person
{ // start declaration of public class Student, this class extends (inherits from) class Person
	public static void main(String[] args)
	{ // start declaration of the main method
		System.out.println("Hello, I am a Student!"); // print a simple message
	} // end declaration of the main method

	public Student() 
	{ // begin declaration of no parameters constructor
		System.out.println("The no parameters construcor for class Student has been called.");
	}
} // end declaration of class Student
