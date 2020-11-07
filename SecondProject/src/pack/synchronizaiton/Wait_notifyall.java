package pack.synchronizaiton;

public class Wait_notifyall {

	int amount=2000;  //an instance variable of our class.
	
	synchronized void withdraw(int amount) { //this method will withdraw the amount.
		
		if(this.amount>amount) {
			System.out.println(amount+" withdrawn successfully.");
			this.amount-=amount;
		}
		else {
			 System.out.println("Insufficient amount");
			 System.out.println("Waiting for deposit");
			 try {         //after the above line of code, the next lines of code will wait for the execution until 'notify()' OR 'notifyAll()' method is executed.
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Withdraw is continuing....."); 
			withdraw(amount); //calling the current fn after depositing some amount with 'deposit()' method that was called with the hlp of another thread.
			
		}

	}
	
	synchronized void deposit(int amount) //this method will deposit the amount.
	{
		System.out.println(amount+ " deposited successfully");
		this.amount+=amount;
		notifyAll();
	}

	public static void main(String[] args) {
		
		Wait_notifyall w=new Wait_notifyall();
		new Thread()  //thread 1.
		{
			public void run() {
				w.withdraw(5000);
			}
		}.start();
		
		new Thread()  //thread 2.
		{
			public void run() {
			   w.deposit(10000);
		   }
		}.start();
		
	}

}
//We are creating 2 methods:- one for withdrawing and other for depositing the money. In our main method, they will be called using 2 different threads.
//When the first thread calls the withdraw method, it will first check whether the amount send as an argument is greater than the local amount. If
//yes, then amount will be printed but if not, then after printing 2 statements, it will hold the execution of the method further.Then, the next thread
//will start with deposit value as an argument followed by 'notifyAll()' method. After execution of 'notifyAll()' method, the code after 'wait()'
//will be executed.
//Q- Can we only use wait(),notifyAll() in 'synchronized' methods?


