package basic;

public class PATTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int row=5;
/*		
		for(int i=0;i<=row;i++)
		{

			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
					}
		System.out.println("");
	}
		
	
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
			
		}		
		
		
		
		
				for(int i=0;i<=row;i++)
				{
					for (int j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
							}
				System.out.println("");
			}
				
				

				for(int i=0;i<=row;i++)
				{
					 
					
					for(int j=0;j<=row-i-1;j++)
					{
						System.out.print("* ");
							}
				System.out.println("");
			}
			*/	
			
				/*for(int i=0;i<=row;i++) {
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
					}
				for(int i=0;i<=row-1;i++) {
					for(int j=0;j<=row-1-i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
		
*/


             for(int i=0;i<=row;i++)
             {
           for(int j=2*(row-i);j>=0;j--)
            	 {
            		 System.out.print(" ");
            	 }
            	 for(int z=0;z<=i;z++)
            	 {
            		 System.out.print("* ");
            	 }
            	 System.out.println("");
             }
             for(int i=row;i>=1;i--)
             {
            	 for(int j=row;j>=i;j--)
            	 {
            		 System.out.print("  ");
            	 }
            	 for(int z=1;z<=i;z++)
            	 {
            		 System.out.print("* ");
            	 }
            	 System.out.println("");
             }
            
			







		







	}}		
		
	