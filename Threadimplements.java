
public class Threadimplements implements Runnable{
	   public void run()
	   {
		   System.out.println("Hello India ,I am :"+Thread.currentThread().getName());
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Threadimplements();
		Thread th=new Thread(r);
		th.start();
		
		Thread th1=new Thread(r);
		th1.start();

		Thread th2=new Thread(r);
		th2.start();

		Thread th3=new Thread(r);
		th3.start();

		Thread th4=new Thread(r);
		th4.start();
		
	


	}

}
