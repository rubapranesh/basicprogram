package basic;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs =new HashSet();
		HashSet hss =new HashSet(100,(float) (0.75));
		
		
		hss.add(1);
		hss.add(2);
		hss.add('l');
		hss.add(null);
		hss.add(3);
		hss.add("string");
		
		System.out.println(hss);
		
		hss.remove(1);
		System.out.println(hss);
		
		System.out.println(hss.contains(2));
		System.out.println(hss.isEmpty());
		
		for(int i=0;i<hss.size();i++)
		{
			System.out.println(hss);
		}
		
		
		for(Object d:hss)
		{
			System.out.println(d);
		}
		
		Iterator It =hss.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}
		
		
		
		
		
		
		
		
	}

}
