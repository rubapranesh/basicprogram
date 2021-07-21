package basic;

import java.util.Hashtable;
import java.util.Iterator;

import java.util.Hashtable;
import java.util.Iterator;


public class hashtable {

	public static void htain(String[] args) {
		// TODO Auto-generated htethod stub
		
		Hashtable ht = new Hashtable();
		
	//	Hashtable ht = new Hashtable(initial Capacity);   /// we can give the siza
		
		ht.put(101, "pranesh");
		ht.put(102, "logesh");
		ht.put(103, "black");
		ht.put(104, "santo");
		ht.put(105, "rahtesh");
		
		System.out.println(ht);
		
		System.out.println(ht.get(101));
		ht.remove(102);
		System.out.println(ht);
		
		System.out.println(ht.containsKey(101));
		
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.keySet()); /////return key ----output is set
		
		System.out.println(ht.values()); /// return value in collection
		
		System.out.println(ht.entrySet());  ///return the all entry in set
		
		
		for(Object o:ht.keySet())
		{
			System.out.println(ht.get(o));
		}
		
		
		Iterator a=ht.keySet().iterator();
		while(a.hasNext()) {
			System.out.println(a.next()+"    "+ht.get(a));
		}
		
		
		
	

	}

}
