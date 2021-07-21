package basic;

import java.util.Scanner;

public class Areaoftriangle {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        
        methos(h,b);
        
        }
	
	public static double methos(double a,double f) {

               double c;
               c=(a*f)/2;
               
               System.out.println(c);
               return c;

		
				
		
	}
}