package basic;

public class uniquethreedigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=2;
		
		for (int i=1;i<=4;i++)
		  for(int j=1;j<=4;j++)
			for(int k=1;k<=4;k++)
			{
				if(k!=i && k!=j && i!=j)
				System.out.println(i + " " + j + " " + k);
			}
		
		System.out.println();
				
				
		
		
		
	
	
}}
