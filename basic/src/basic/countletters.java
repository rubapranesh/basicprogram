package basic;

public class countletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="AAA 123";
		char arr [] =s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(arr[i]))
			{
				++count;
				
			}
			
			
			
		}
		
		System.out.print(count);
		
		
		
		

	}

}
