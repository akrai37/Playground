package Threadsdemo.exceptiondemo;

public class User {

	public static void main(String[] args) {
		
		A_thread a= new A_thread();
		B_thread b= new B_thread(); 
		b.setName("naming b object of B_Thread with the setname() method.");
		a.start();
		b.start();
//		C_runnable rn=new C_runnable();  //This code is for calling 'C_runnable' file.
//		Thread th=new Thread(rn);
//		th.start();
		
	}

}
