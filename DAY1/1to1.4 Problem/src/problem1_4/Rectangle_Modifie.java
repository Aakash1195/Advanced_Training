package problem1_4;

import java.util.Scanner;

public class Rectangle_Modifie {
int Length ;
int width;
int Area;
int perimeter;

public int getLength() {
	return Length;
}
public void setLength(int length) {
	Length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}

public Rectangle_Modifie() {
	Length = 1;
	width =1;
	
}

void input () {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Length of Rect");
	Length=sc.nextInt();
	System.out.println("Enter the Width of Rect");
	width = sc.nextInt();
}
void  areaRectangle()
{
    Area = Length * width;
   
}

 void  perimeterRectangle()
{
	 perimeter = 2*(Length + width);
   
}

void display() {
	if(Length>0 && Length<20)
    {
    System.out.println("Area of Rectangle = " + Area);
    System.out.println("Parameter of Rectangle = " +perimeter);}
   
    }

public static  void mainj (String [] args) {
	Rectangle_Modifie rm = new Rectangle_Modifie();
	rm.input();
	rm.areaRectangle();
	rm.perimeterRectangle();
	
}
}
