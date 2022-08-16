import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Integer> a=new ArrayList<Integer>();
	       for(int i=1;i<=10;i++)
	       {
	    	   a.add(i);
	       }
	       
	       a.forEach(System.out::println);

	}

}
