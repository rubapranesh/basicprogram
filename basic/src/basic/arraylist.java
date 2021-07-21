package basic;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("string");
		al.add("add");
		
		
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		java.util.Iterator<String> ab=al.iterator();
		
		while(ab.hasNext())
		{
			System.out.println(ab.next());
		}
		
		
		
		
		
	}

}
