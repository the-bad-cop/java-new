class Thread1 extends Thread {

	//synchronized
	 public void run() {
		for (int i =0;i<3 ;i++ ) {
			System.out.print("A");
			System.out.print("B");
		}
	}}

class Thread2 extends Thread {
	
	//synchronized 
	public void run() {
		for (int i=0;i<3 ;i++ ) {
			System.out.print("C");
			System.out.print("D");
		}
	}}

class MainThread {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}