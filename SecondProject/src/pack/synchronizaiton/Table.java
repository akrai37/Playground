package pack.synchronizaiton;

public class Table {    //This class is inherited by 'A' and 'B' classes.

public synchronized void print(int x) { //public synchronized static void print(int x)   find explanation below.
	
	 //synchronized(this){   This line represents block or object level synchronization.We have to put all our data in the 'synchronized' method. 'this' here represents the current object which is the current class ('Table').              
		 
		 for(int i=0;i<=5;i++) 
		 {
			 System.out.println(i*x);
			 try {
				Thread.sleep(1500);
			} 
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                                                      
		 }
	 
	// }
	

 }

}

//Three ways to achieve synchronization.They are:-
//1.Method Level synchronization
//2.block or object level
//3.static or class level synchronization
//All three are demonstrated above

//1.synchronized keyword:- using 'synchronized' keyword in the method declaration make the whole method synchronized and is known as method synchronization.
// So, all the content(everything inside the method) of the method are synchronized
//2.If we are using 'static synchronized', then we are making the method static and synchronized at the same time.This type of synchronization is known as
// class level synchronization. Whenever and wherever, we would access the content of this class, we won't be required to create instance of this class and can 
// directly access any obj by using the class name directly.

//.