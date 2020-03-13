package Example2_Method_Overriding;

public class Test {

	public static void main(String[] args) 
	{
		Person P = new Person();
		Teacher T = new Teacher();
		Student S = new Student();
		
		P.Show(); // Person class er Show method k call korbe but this is not  " METHOD OVERRIDE "
		T.Show(); // Teacher class er Show method k call korbe but this is not  " METHOD OVERRIDE "
		S.Show(); // Student class er Show method k call korbe but this is not  " METHOD OVERRIDE "
		
		System.out.println ( " ********** Now Method OVER-RIDE Starts ****************** ");
		
		
		P = new Person (); // Aita normally Person class er Show() method k call korbe 
		P.Show();
		
	    P = new Teacher(); // Person Class er Reference Variable P akhon Teacher Class er Object k reffer korbe 
		T.Show (); // Print korbe Teacher Class er Show() Method // P.Show() dieo Teacher Class Er Show() Method Print Korbe 
		
		P = new Student();  // Person Class er Reference Variable P akhon Student Class er Object k reffer korbe 
		S.Show();  // Print korbe Student Class er Show() Method // P.Show() dieo Student Class Er Show() Method Print Korbe 
		
		
		// Amra Only Parent Class Er Reference Variable Diye Child Class Er Object k Reffer korte Parbo
		// Jemon Only Person Class Er Reference Variable P Diye Teacher and Student  Class Er Object T and S k Reffer korte Parbo
		// P = new Person (); Ei Vabe Likhte Parbo Kintu T = new Person (); Or S = new Person (); Likhte Parbo Na
		
		// Kintu Child Class Er Reference Variable Diye Parent Class Er Object k Reffer korte Parbo Na
		// Jemon Teacher or Student Class Er Reference Variable T Or S  Diye Person Class Er Object  P k Reffer korte Parbo Na
		
	}

}
