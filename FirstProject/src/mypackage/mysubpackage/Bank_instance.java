package mypackage.mysubpackage;

public class Bank_instance {
int amount=3000;
	public static void main(String[] args) {
		Bank_instance b1=new Bank_instance();//Instance variable(stored in the temporary memory)
		Bank_instance b2=new Bank_instance();//Instance method(stored in the temporary memory)
		
		b1.amount+=2500; //The change that we have made in the 'amount' will only be reflected in the b1 bank account.cont.
						 //and not in other bank accounts.Thats the advantage of instances.	
		
		System.out.println("The amount in bank b1 is "+b1.amount+".");
		System.out.println("The amount in bank b2 is "+b2.amount+".");
	}

}
//about 'String[] args'
//Whenever you run a Java program with command prompt or want to give command line arguments, then “String[] args” is used.
//So basically it takes input from you via command lines. If you don't use command line arguments then it has no purpose to your code.
//eg. Your class name is “abc” then command call will be 
//   >javac [filename].java
//   >java abc 1 2 3
// Javac is used for compiling your source code.
// Then next line calls your class “abc” and sends “1 2 3” as arguments, which are stored in “String[] args” i.e. args[0] will have “1” , args[1] will have “2” and args[2] will have “3”.
