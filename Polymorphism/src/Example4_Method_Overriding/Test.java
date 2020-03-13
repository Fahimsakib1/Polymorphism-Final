package Example4_Method_Overriding;

public class Test 
{

	public static void main(String[] args) 
	{
		Shape S = new Shape ();
		System.out.println(S.Area(5.25, 6.12)); // Shape class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		Rectangle R = new Rectangle ();
		System.out.println(R.Area(2.5 , 6.5 ));  // Rectangle class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		Triangle T = new Triangle ();
		System.out.println(T.Area(10.25, 5.21 ));  // Triangle class er Area() method k call korbe but this is not  " METHOD OVERRIDE "
		
		
		System.out.println("*******************  Now Method OVER-RIDING starts *************** ");
		
		Shape S1 = new Shape ();
		System.out.println(S1.Area(1.11, 3.19)); // Shape class er Area() method k call korbe And this Time It Is  " METHOD OVERRIDING "
		
		Shape S2 = new Rectangle ();
		System.out.println(R.Area(2.14, 4.36));  // Rectangle class er Area() method k call korbe And this Time It Is  " METHOD OVERRIDING "
		                                        // R.Area(2.14, 4.36) Na Diye S2.Area(2.14, 4.36) Dileo Rectangle Class Er Area() Method K call Korto
		
		Shape S3 = new Triangle ();
		System.out.println(S3.Area(7.54, 9.16));  // Triangle class er Area() method k call korbe And this Time It Is  " METHOD OVERRIDING "
		                                         // S3.Area(7.54, 9.16) Na Diye T.Area(7.54, 9.16) Dileo Triangle Class Er Area() Method K call Korto
		
		
		}

}
