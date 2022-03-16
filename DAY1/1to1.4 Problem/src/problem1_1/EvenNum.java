package problem1_1;

import java.util.Scanner;

public class EvenNum
{
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int a = sc.nextInt();
		
		int num = a % 2;
		
		for (int i = 1; i<=a; i++) {
			if (i%2==0) {
				
				System.out.println("The given number is Even = "+i);
			}
			
		}
		
		
	}
	

}
