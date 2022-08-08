
 class Printer implements Runnable{
	public void run()
	{
		System.out.println("child Thread is running");
	}

}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Printer p=new Printer();
          Thread t=new Thread(p);
          t.start();
          System.out.println("Main thread is running:"+Thread.currentThread().getName());
	}

}
