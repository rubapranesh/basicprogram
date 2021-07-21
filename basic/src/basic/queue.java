package basic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q = new PriorityQueue(); /////////hetrogeneous data is not allowed
		
		////we can use the same data for Linked list
		
	//	LinkedList q= new LinkedList();
		q.add('a');
		q.add('b');
		q.add('c');
		q.add('d');
		q.add('e');
		q.offer('f');
		
	System.out.println(q);
		
		System.out.println(q.element());   //empty means Exception
		System.out.println(q.peek());      //empty means null
	
		
		
		System.out.println(q.remove()); ///// remove header and delete 
		System.out.println(q);              /// empty means exception
		
		System.out.println(q.poll()); ///// remove header and delete 
		System.out.println(q);         // empty means null
		
		Iterator i = q.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}