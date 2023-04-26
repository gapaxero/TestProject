package testThread;

public class Racing2 {

	public static void main(String[] args) {
		int h1 = 0;
		hRunable hr = new hRunable();
		Thread thr = new Thread(hr);
		
		thr.start();
		
		HorseRace h = new HorseRace();
		h.start();
		
		for (int i=0; i<20; i++){
            h1++;
            System.out.println("H1:"+h1);
        }
		
	}
	
	public static void raceTest() {
		int h1 = 0;
		int h2 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			h1++;
			h2++;
			System.out.println("H1: " + h1);
			System.out.println("H2: " + h2);
		}
	}

}

class HorseRace extends Thread{
	public void run() {
		int hr = 0;
		
		for(int i = 0 ; i < 20 ; i++) {
			hr++;
			System.out.println("HR: " + hr);
		}
	}
}


class hRunable implements Runnable {

	@Override
	public void run() {
		int a = 0;
		for (int i = 0; i < 20; i++) {
			a++;
			System.out.println("aRunable: " + a);
		}
	}

}


