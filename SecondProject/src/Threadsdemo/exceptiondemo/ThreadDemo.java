package Threadsdemo.exceptiondemo;

public class ThreadDemo extends Thread{ //Thread is a class for performing thread operations.

	public static void main(String[] args) {
        ThreadDemo th1= new ThreadDemo();
        ThreadDemo th2= new ThreadDemo(); 
        th1.start();
        th2.start();
	}
    public void run() {
    	for(int i=0;i<=5;i++) {
    		System.out.println(i);
    		try {                     //if we are using 'Thread' method, we have to pass it in the 'try-catch' block.
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
    	}
    }
}
//1.thread operations are needed when we have many processes to deal with. There are 2 ways to perform thread operations:- through 'Thread' and 'Runnable'
//2.'Thread' doesn't allow multiple threading but 'Runnable' does. We have to create a 'run()' method if we are using thread.
//3.Every class can have only one 'run()' class.We can have different thread objects but the 'run()' class can only be one UNLESS we use anonymous threading.
//4.In case of 'Thread', we will create a new object of our class and assign it to an instance. Then we will call '.start()' method to start the thread.cont
//that will basically call the 'run()' which contains our process(s).
//5.it is not possible to have more than one run thread method in a class.
//6.'implements runnable' is used for multiple threading. 'extends thread' is used for single threading