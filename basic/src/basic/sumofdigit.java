package basic;

import java.util.Scanner;

public class sumofdigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++)
        {
        	char b = name.charAt(i);
        	int a=Character.getNumericValue(b); 
        	
        	
        	
        	c=c+a;
        	       	 }
        System.out.println(c);
        
        
        

}
}