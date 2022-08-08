
 class Threadex extends Thread{
   public void run(){
	  System.out.println("child therad running"+currentThread().getName());
	  
  }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadex t=new Threadex();
		t.start();
		t.setPriority(5);
		
			System.out.println("Main thread is running:"+Thread.currentThread().getName());
			

	}

}
