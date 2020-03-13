package Example1_Method_Overloading;

public class Test 
{

	public static void main(String[] args) 
	{
		Calculator C1 = new Calculator ();
		
		System.out.println ( " Addition : " + C1.add(5, 10));
		System.out.println ( " Addition : " + C1.add(5.97, 10.55 , 3.21));
		System.out.println ( " Subtraction : " + C1.sub(18.5,5.78));
		System.out.println ( " Subtraction : " + C1.sub(5,12));
		
		System.out.println ( " Addition : " + C1.add(5, 10 , 12)); // jehetu 3 ta parameter ase double add method er moddhe and type double a, double b, double c
		                                                          //tai compiler add (5,10,12 ) int  value k type casting kore double kore nibe. 
		
		
		
		
		

	}

}
