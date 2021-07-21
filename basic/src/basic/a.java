package basic;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      String x = in.next();
	    	
	     
	      char a[]=x.toCharArray();
	      
	      
	      for(char b: a) {
	      System.out.println(b);
	      }
	     String s= x.substring(1, 6);
	      
	      System.out.println(s);
	      
	      
	}

}
