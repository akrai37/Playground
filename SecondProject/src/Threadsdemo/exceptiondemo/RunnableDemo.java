package Threadsdemo.exceptiondemo;

public class RunnableDemo implements Runnable{ //It supports ultiple threading.

	public static void main(String[] args) {
        RunnableDemo rn=new RunnableDemo();
        Thread th1=new Thread(rn);   //Unlike 'Thread' ,we have to create an object of 'Thread' in the Runnable and pass the object of our class into it.
        th1.start();
	}
	
    public void run() {
    	
    	for(int i=0;i<=5;i++) {
    		System.out.println(i);
    		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
