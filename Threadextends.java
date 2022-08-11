
public class Threadextends extends Thread{
	public void run()
	{
		System.out.println("Hello ALL ,I am :"+currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadextends th1=new Threadextends();
		th1.start();
		
		Threadextends th2=new Threadextends();
		th2.start();

		Threadextends th3=new Threadextends();
		th3.start();

		Threadextends th4=new Threadextends();
		th4.start();

		Threadextends th5=new Threadextends();
		th5.start();
		
		

	}

}
