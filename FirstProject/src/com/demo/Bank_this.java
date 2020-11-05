//We cannot use 'this' keyword for static methods, we can only use them for instances. Thats why, we cannot use 'this' in our 'main' method because 
//it is also a static method.
package com.demo;   

public class Bank_this {    //more use of 'this'

	int amount=3000;
	void withdraw(int amount) {
		
		if(this.amount> amount) { //here 'this.amount' is referring to the instance variable declared outside.
			System.out.println("Money withdrawn sucessfully!");
			this.amount-=amount;
		}
		else {
			System.out.println("Not sufficient amount.");
		}
		
	}
	void balance() {
		System.out.println("The current balance is "+amount+".");
	}
	public static void main(String[] args) {
		Bank_this b1= new Bank_this();
		b1.withdraw(2050);
		b1.balance(); 

	}
}
//Note:-The changes in the variable of 'withdraw()' method will be reflected in the  'balance()' as well ONLY if the objects are same for calling both
//the methods.(here we are using b1 to call both withdraw() and balance(), so they both are part of one object.) 
