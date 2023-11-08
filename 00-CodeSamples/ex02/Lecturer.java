/** Eoin Finnerty <br>
Wednesday 20231108 1148 <br>
Studebnt class <br>
Sample code to demonstrate class declaration and inheritance (extending classes) <br>
*/
public class Lecturer extends Person
{ // start declaration of public class Lecturer, this class extends (inherits from) class Person
	public static void main(String[] args)
	{ // start declaration of the main method
		System.out.println("Hello, I am a Lecturer!"); // print a simple message
	} // end declaration of the main method

	public Lecturer()
	{ // begin declaration of no parameters constructor
		System.out.println("The no parameters construcor for class Lecturer has been called.");
	}
} // end declaration of class Lecturer