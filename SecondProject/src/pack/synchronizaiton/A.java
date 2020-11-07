package pack.synchronizaiton;

public class A extends Thread{ //below, we are indirectly accessing an instance of 'Table' class. don't foucs too much on technicality.

	Table t;
	A(Table t){
		this.t=t;
	}
	public void run() {
		t.print(100);
	}
}


//************The below code is applicable for class level synchronization

//package pack.synchronizaiton;
//
//public class A extends Thread{
//
//	public void run() {
//		Table.print(100);
//	}
//}
