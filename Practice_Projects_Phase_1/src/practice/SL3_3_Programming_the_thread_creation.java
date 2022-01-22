package practice;

public class SL3_3_Programming_the_thread_creation extends Thread {

	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		SL3_3_Programming_the_thread_creation mt = new SL3_3_Programming_the_thread_creation();
	  		mt.start();
	 	}
	

}
