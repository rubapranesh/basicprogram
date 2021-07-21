package basic;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
		
		
        String[] wordss=s.split(" ");
 String empty="";
        
        System.out.println(wordss.length);
        
        for(String w:wordss){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse(); 
            empty=empty+sb.toString()+" ";  
        	
        	
        }
        System.out.println(empty.trim());
	
	}

}
