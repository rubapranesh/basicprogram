package basic;

import java.util.Scanner;

public class passwordincomplete{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        System.out.print(
	                "1. A password must have at least eight characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
	        String s = input.nextLine();

	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: " + s);
	        } else {
	            System.out.println("Not a valid password: " + s);
	        }

		
		
			    }

	private static boolean is_Valid_Password(String s) {
int i=0;
char ch=0;

               for(i=0;i<s.length();i++)
               {
            	   ch=s.charAt(i);
            	   System.out.println(ch);
            	   
            	   if((ch >= '0' && ch <= '9')) i++;
            	   else if((ch >= 'A' && ch <= 'z')) ch++;
            	   else return false;
            		   
            	   
            	   
               }
		
		
		
		
		
		return false;
	}

	}


