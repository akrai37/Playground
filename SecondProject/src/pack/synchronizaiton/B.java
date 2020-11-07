package pack.synchronizaiton;

public class B extends Thread{


	Table t;
	B(Table t){
		this.t=t;
	}
	public void run() {
		t.print(1000);                                           
	}
}

//************The below code is applicable for class level synchronization

//package pack.synchronizaiton;
//
//public class B extends Thread{
//
//	public void run() {
//		Table.print(1000);
//	}
//}