package basic;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		
		LinkedList a=new LinkedList();
		
		a.add("pranesh");
		a.add(1);
		a.add('c');
		
		System.out.println(a);
		System.out.println(a.size());
		a.remove(0);
		System.out.println(a);
		a.add("ruba");
		System.out.println(a);
		//add element in middle
		a.add(2,'g');
		System.out.println(a);
		//get value
		System.out.println(a.get(3));
		//set value
		a.set(0,5);
		System.out.println(a);
		
		
		//contains
		System.out.println(a.contains(5));
		
	  for(Object b: a) {
		  System.out.println(b);
	  }
	  
	  Iterator it= a.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  
/*	  //add multiple objects
	  LinkedList g =new LinkedList();
	  g.add('d');
	 g.addAll(a);*/
	  
	  LinkedList g =new LinkedList();
	  g.add('d');
	  g.add('f');
	  g.add('F');
	  
	  
	  System.out.println(g);
	  
	  
	  Collections.sort(g);
	  System.out.println(g);
	  Collections.sort(g,Collections.reverseOrder());
	  System.out.println(g);
	  
	  
	  ////specific methods in linked list-------Stack and Que
	  
	  g.addFirst('r');
	  g.addLast('o');
	  System.out.println(g);
	  
	  //add.remooveLast
	  //add.removeFirst
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
	}

}
