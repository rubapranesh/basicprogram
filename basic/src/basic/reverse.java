package basic;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//with buffer
		String s="ABCD";
		
		StringBuffer buff =new StringBuffer();
		
		buff.append(s);
		
		System.out.println(buff.reverse());
		System.out.println(s.length());
		
		
		//without buffer
		  Scanner scanner = new Scanner(System.in);
		  char[] letters = s.toCharArray();
		for(int i =letters.length-1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
	
		}

}
