package basic;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();*/
        
    methos();
        }
	
	public static boolean methos() {

               int c;
               int n=3;
               
               if (n < 2) return false;

               for (int i = 2; i <= n / 2; i++) {

                   if (n % i == 0) return false;
               }
               System.out.println(n);
               return true;
	}

		
		
		
		
		
	}

