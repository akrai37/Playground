package Threadsdemo.exceptiondemo;

public class A_thread extends Thread{  //It is a class that extends 'Thread'.It is used in 'User' class.
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" thread is running."); 
	}
}
//1.Thread.currentThread().getName():-  prints the current thread number. If the name has been set using setname() method in the calling class, then
//that name will be printed.