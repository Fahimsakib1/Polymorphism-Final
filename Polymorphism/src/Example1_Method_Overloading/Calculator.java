// Polymorphism : Polymorphism means use the same method again or the same method has different forms

// Compile Time Polymorphism : Same name er method or function thakbe kintu functiin er parameter gulor type alada hobe or differct parameter thakbe 

// Example 1 is basically Method " OVER-LOADING " and aita COMPILE time e hoy


package Example1_Method_Overloading;

public class Calculator 

{
    
	public  int add ( int a, int b)
	{
		
		return a+b;
		
	}
	
	public int sub ( int a, int b)
	{
		
		return a-b;
		
	}
	
	public double add ( double a, double b , double c)
	{
		
		return a+b+c;
		
	}
	
	public double sub ( double a, double b)
	{
		
		return a-b;
		
	}
	
	
}
