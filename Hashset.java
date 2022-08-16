import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet <Integer> h=new HashSet<Integer>();
       for(int i=1;i<=10;i++)
       {
    	   h.add(i);
       }
       
       h.forEach(System.out::println);
	}

}
