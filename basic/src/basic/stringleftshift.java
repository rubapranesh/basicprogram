package basic;

public class stringleftshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "GeeksforGeeks";
		System.out.println(str1.length());
        System.out.println(leftrotate(str1, 1));
        System.out.println(rightrotate(str1, 3));
		
		
}
	  static String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	  static String rightrotate(String str, int d)
	    {
	            return leftrotate(str, str.length() - d);
	    }
	 }
