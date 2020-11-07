package Threadsdemo.exceptiondemo;

public class B_thread extends Thread{ //It is a class that extends 'Thread'.It is used in 'User' class.

    public void run() {
    	 System.out.println(Thread.currentThread().getName()+" as B thread is running.");
    }

}
