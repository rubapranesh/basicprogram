package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap m =new HashMap();
		////put--add the key and value
		
		HashMap<Integer,String> m =new HashMap<Integer,String>();
		
		m.put(101, "pranesh");
		m.put(102, "logesh");
		m.put(103, "black");
		m.put(104, "santo");
		m.put(105, "ramesh");
		
		System.out.println(m);
		
		System.out.println(m.get(101));
		m.remove(102);
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet()); /////return key ----output is set
		
		System.out.println(m.values()); /// return value in collection
		
		System.out.println(m.entrySet());  ///return the all entry in set
		
		
		for(Object o:m.keySet())
		{
			System.out.println(m.get(o));
		}
		
		
		Iterator a=m.keySet().iterator();
		while(a.hasNext()) {
			System.out.println(a.next()+"    "+m.get(a));
		}
		
		
		
		///Entry methods
		
for(Map.Entry entry:m.entrySet())       ////map.Entry is a interface name
{
	System.out.println(entry.getKey()+"     "+entry.getValue());
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
