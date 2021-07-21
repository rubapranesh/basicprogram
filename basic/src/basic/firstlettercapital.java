package basic;

import java.util.Scanner;

public class firstlettercapital {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
/*        String d = null;
        String[] words=s.split(" ");
        System.out.println(words.length);
        
        for(String l:words)
        {
        	              
        char a[]=l.toCharArray();
      
        	char c=Character.toUpperCase(a[0]);
        	 d=Character.toString(c);
        	
        	 System.out.print(d + l.substring(1, l.length()));
        	 System.out.print(" ");
        
 }*/
     
        ////ANOTHER PROGRAM STRING REVERSE
        String[] wordss=s.split(" ");
 String empty="";
        
        System.out.println(wordss.length);
        
        for(String w:wordss){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse(); 
            empty=sb.reverse()+" "+empty;
        	
        	
        }
        System.out.println(empty.trim());
	
	
	
	
	
}
}