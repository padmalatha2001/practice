
import java.util.concurrent.*;
public class Threadpool implements Runnable{
           private int num;
           Threadpool(int num)
           {
        	   this.num=num;
           }
           public void run()
           {
        	   System.out.println(Thread.currentThread().getName()+ "  "+num);
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex=Executors.newFixedThreadPool(5);
	 for(int i=1;i<=10;i++)	
		{
		    Runnable th=new Threadpool(i); 
		    ex.execute(th);
		    /*As max threads are 5,only 5 threads are created and all tasks are completed by 
		       5 threads only, first 5 tasks are allocated to 5 threads remaining tasks waits 
		      in queue whenever a threads  become idle the remaining tasks are allocated to 
		      the idle threads.
		    so we observe thread  task
		                    1       1
		                    2		2
		                    3		3
		                    4		4
		                    5		5
		                    remaining thread and task allocation and order of printing is not guaranteed.
		      */
		}
		
		ex.shutdown();
        
	}

}
