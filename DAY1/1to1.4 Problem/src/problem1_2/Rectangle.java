package problem1_2;

 public class  Rectangle {
	private  int Length ;
    private  int Breadth ;
    private  int Area ;
    private int perimeter;
    	
    public Rectangle ()
    {
    	System.out.println("First Constructor is running because of we are directly assigneing the values");
		System.out.println();
    	Length= 1;
		Breadth = 2 ;
    	
    }
    
    
	
	public  Rectangle(int a , int b)  // Constructor2
	{
		Length =a;
		Breadth = b;
		System.out.println("Second Constructor is running because of we are passing the values by object");
		System.out.println();
		System.out.println(Length);
		System.out.println(Breadth);
		System.out.println();
		
    }
	
	void calculate () 
	{
	
	Area = Length * Breadth	;
	perimeter = 2 * (Length * Breadth);
	}
	
	public int getLength() {
		return Length;
	}



	public void setLength(int length) {
		Length = length;
	}



	public int getBreadth() {
		return Breadth;
	}



	public void setBreadth(int breadth) {
		Breadth += breadth;
	}



	void display() {
		System.out.println("The Area OF the Rectangle is  = "+Area);
		System.out.println("Perimeter Of the Rectangle is = "+perimeter);
		
	}
	
	
 }
 
 //object is created in same package with different class name in next file.
	
	