import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring a queue and adding elements to queue
		Queue <Integer> q=new PriorityQueue<Integer>();
		Integer s=0;
		for(int i=1;i<7;i++)
		 {
			q.add(i);
		 }
         
		
		//Printing elements in queue
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())								
		{
	       System.out.print(itr.next()+" ");
	       
		}
		
		
		//Calculating sum of elements in queue and printing sum
		itr=q.iterator();
        while(itr.hasNext())								
		{
			s=s+itr.next();
		}
		System.out.println("\nsum:"+s);
		
		
		//removing 2 elements and print them 
		System.out.println("removed elements");
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		//print remaining elements in queue
		System.out.println("existing elements");
		itr=q.iterator();
		while(itr.hasNext())								
		{
				System.out.print(itr.next()+" ");
		}
	}

}
