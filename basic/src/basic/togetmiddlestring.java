package basic;

import java.util.Scanner;

public class togetmiddlestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        if((name.length()%2)==1)
        {
        	int i =(name.length()/2) ;
        	
        	System.out.println(name.substring(i,i+1));
        	
        }
        else
        {
        	int i =name.length()/2;
        	
        	System.out.println(name.substring(i-1,i+1));
        }
        
	
		
		
	}

}
