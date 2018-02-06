import java.util.Scanner;

public class PolyTest extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Current Thred is stated");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Current Thred is");
		
	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		
		/*p.a(null);
		
		double x=p.getval(8);
		
		long y=p.getval2(3.0);
		
		*/
		Thread t1=new Thread();
		t1.start();
		System.out.println("Current Thred is started .........");
		
		
	}

	
	

}
