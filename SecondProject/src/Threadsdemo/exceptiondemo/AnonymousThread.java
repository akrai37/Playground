package Threadsdemo.exceptiondemo;

public class AnonymousThread {  //We are not extending or implementing any class here.

	public static void main(String[] args) {
         //Thread th1= new Thread();
		 Thread th1= new Thread() {
			 public void run() {
				 System.out.println("1st anonymous thread is running.");
			 }
		 };
		 new Thread() {  //Even if we don't want to create an instance, we can still declare a thread object and define 'run()' method and '.start()' can be attached in the end.
			 public void run() {        
				 System.out.println("2nd anonymous thread is running.");
			 }
		 }.start();
		 th1.start();
		 //th2.start();
	}

}
//1.Anonymous threading can be used if we want more than one 'run()' method in our class. 
//2.Earlier, We could create multiple object threads but only one 'run()' method but with anonymous threading, we can create multiple object threads with
//multiple 'run()' methods like above.
//3a.anonymous object:- is defined within the thread parameter and called inside it only. 
//3b.They can be used to define multiple thread methods in the same class by creating different objects of the Threads and defining them along.