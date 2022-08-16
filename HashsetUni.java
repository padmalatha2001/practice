import java.util.*;
public class HashsetUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet <Integer> h=new HashSet<Integer>();
		//adding duplicate elements
	       for(int i=10,j=10;i>0;i--,j--)
	       {
	    	   h.add(i);
	    	   h.add(j);
	       }
	       
	       h.forEach(System.out::println);

	}

}
