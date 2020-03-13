package Example3_Method_Overriding;

public class Rectangle extends Shape

{
      public double length;
      public double width;
      
      
	  public Rectangle(double length, double width) 
	  
	  {
		
		this.length = length;
		this.width = width;
	  }
	  
	   public double Area ()
		{
			
			System.out.print( " Area Of Rectangle Class :  ");
			return length * width ;
		}
      
      
}
