package testThread;
	
public class ThreadTest extends Thread{
	public static void main(String[] args) {
		int p2 = 0;
		{// a.同步進第二個方法
			per p1 = new per();
			p1.start();
		}
		 for(int i = 0;i<20 ; i++) {
			 p2++;
			 System.out.println("P2: "+p2);
		 }
	}

}

class per extends Thread {
	public void run() {
		int p1 = 0;
		for (int i = 0; i < 20; i++) {
			p1++;
			System.out.println(getName() + ": " + p1);
		}
	}
}

class perRunable implements Runnable {
	@Override
	public void run() {
		int a = 0;
		for (int i = 0; i < 20; i++) {
			a++;
			System.out.println("aRunable: " + a);
		}

	}

}


