package basic;

import java.util.Scanner;

public class Scannerr {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        double x = in.nextDouble();
	        System.out.print("Input the Second number: ");
	        double y = in.nextDouble();
	        System.out.print("Input the third number: ");
	        double z = in.nextDouble();
	        System.out.print("The smallest value is " + method1(x, y, z)+"\n" );
	        
	      /*  Scanner sc = new Scanner(System.in);
	        
	        // String input
	        String name = sc.nextLine();
	  
	        // Character input
	        char gender = sc.next().charAt(0);
	  
	        // Numerical data input
	        // byte, short and float can be read
	        // using similar-named functions.
	        int age = sc.nextInt();
	        long mobileNo = sc.nextLong();
	        double cgpa = sc.nextDouble();*/
		
	}
	static double method1(double a,double b,double c) {
		
		return Math.min((Math.min(a, b)),c);
	}

}
 
