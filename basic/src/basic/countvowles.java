package basic;

import java.util.Scanner;

public class countvowles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count=0;
        for(int p=0;p<name.length();p++)
        {
        	
        	for (int j = 0;j<=4;j++) {
        		char a[]= {'a','e','i','o','u'};
        	if(name.charAt(p)==a[j]) {
        		
        		count++;
        		}
        	 }
        }
        System.out.println(count);

	}}
