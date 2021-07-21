package basic;

import java.util.Scanner;

public class Stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String q=sc.nextLine();
	   
	  /*    
	     // Compare the two strings.
	        int result = s.compareToIgnoreCase(q);
	        System.out.println(result);
		*/
	        
	        boolean a=s.contains(q);
	        System.out.println(a);
		
		
		
		
		
	}

}
