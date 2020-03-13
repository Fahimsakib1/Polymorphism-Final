package Example3_Method_Overriding;

public class Test 
{

	public static void main(String[] args) 
	{
		Shape S = new Shape ();
		System.out.println(S.Area()); // Shape class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		Rectangle R = new Rectangle (10.5, 20.2);
		System.out.println(R.Area()); // Rectangle class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		Triangle T = new Triangle (3.2 ,6.8);
		System.out.println(T.Area()); // Triangle class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		
		System.out.println("*******************  Now Method OVER-RIDING starts *************** ");
		
		Shape S1 = new Shape ();
		System.out.println(S1.Area());
		
		Shape S2 = new Rectangle (7.5, 8.6); // Shape Class Er Object S2 Diye Rectangle Class Er object  Reffer kora holo
		System.out.println(S2.Area());      // S2.Area() Diye Rectangle Class Er Method Area() Call Hobe 
		                                   // S2.Area() Na Diye R.Area() Dile Seta Ageyr Rectangle Class Er Area Print Korbe
		
		Shape S3 = new Triangle (9.5, 2.6); // Shape Class Er Object S3 Diye Triangle Class Er object  Reffer kora holo
		System.out.println(S3.Area());     // S3.Area() Diye Triangle Class Er Method Area() Call Hobe 
		                                  // S3.Area() Na Diye T.Area() Dile Seta Ageyr Triangle Class Er Area Print Korbe
		
		
		
		
		
		
		
		
		
	
		

	}

}
