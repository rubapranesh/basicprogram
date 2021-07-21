package basic;

import java.util.Scanner;

public class countofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        String name = sc.nextLine();
	     int  count=0;
	        for (int i = 0; i < name.length(); i++)
            {
                if (name.charAt(i) == ' ')
                {
                    count++;
                }
	}
	        System.out.println(count+1);

}}
