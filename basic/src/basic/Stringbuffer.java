package basic;

import java.util.Scanner;

public class Stringbuffer {

	public static void main(String[] args) {
		

		 Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String q=sc.nextLine();	
	        
	  /*      StringBuffer d= new StringBuffer(s);
	        
	     boolean n= s.contentEquals(d);
	        System.out.println(n);
		
	        
	        char[] arr = s.toCharArray();
	        
	        System.out.println(arr[1]);*/
	        
	        int sum=0;
    char[] arr = s.toCharArray();
	        
    for(int i=0;i<s.length()-1;i++)
    {
    	for(int j=0;j<s.length()-1;j++)
    	{
    	if(arr[i] == arr[j+1])
    		sum++;
    	   
    }
    	System.out.println(sum);
    }
    System.out.println(sum);
	        
	
	}
}
