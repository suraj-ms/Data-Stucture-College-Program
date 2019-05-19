package college;
import java.util.Random;
class SquearThread implements Runnable {
	int x;
	 SquearThread(int x){
		 this.x=x;

	 }
	 public void run() {
		 System.out.println("Thread Name: SquearThread of"+x+ "is"+x*x);
	 }
}
class CubeThread implements Runnable {
	int x;
	 CubeThread(int x){
		 this.x=x;

	 }
	 public void run() {
		 System.out.println("Thread Name: SquearThread of"+x+ "is"+x*x*x);
	 }
}
class RandomThread implements Runnable {
	Random r;
	Thread t2,t3;
	public void run() {
		int num;
	
	r = new Random();
	try {
		while(true) {
			num=r.nextInt(100);
			 System.out.println("Main Thread :Generated Thread is"+num);
			 t2=new Thread(new SquearThread(num));
			 t2.start();
			 t3=new Thread(new CubeThread(num));
			 t3.start();
			 Thread.sleep(1000);
			 System.out.println("=======");
		}
	}
	catch(InterruptedException e) {
		 System.out.println("Interrupth Exception");
	}
}
	}

public class MainThread {

	public static void main(String[] args) {
		RandomThread obj=new RandomThread();
		Thread t1 = new Thread(obj);
		t1.start();

	}
	

}
