package Example3_Method_Overriding;

public class Triangle extends Shape

{
      public double base;
      public double height;
      
      
	  public Triangle(double base, double height) 
	  
	  {
		super();
		this.base = base;
		this.height = height;
	  }
	  
	   public double Area ()
		{
			
			System.out.print( " Area Of Triangle Class :  ");
			return 0.5 * base * height ;
		}
      
      
}
