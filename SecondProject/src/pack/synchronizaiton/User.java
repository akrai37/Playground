package pack.synchronizaiton;

public class User {

	public static void main(String[] args) {
		
		Table tbl=new Table(); //creating an instance of 'Table' class and passing it as an argument of class 'A' and 'B' which extends 'Thread' class.
		A th1=new A(tbl);
		B th2=new B(tbl);
		th1.start();
		th2.start();
		//First, all the values of class 'A' will be printed and then after total completion, values of class 'B' will be printed.THis is achieved through synchronization
	}
}


//************The below code is applicable for class level synchronization

//package pack.synchronizaiton;
//
//public class User {
//
//	public static void main(String[] args) {  no need to create instance of 'Table' class.
//		
//		A th1=new A();
//		B th2=new B();
//		th1.start();
//		th2.start();
//		
//	}
//}
