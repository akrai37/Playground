package mypackage.mysubpackage;

public class Bank_static {
static int amount=3000; 
	public static void main(String[] args) {
		Bank_static b1=new Bank_static();
		Bank_static b2=new Bank_static();
		b1.amount+=2345;
		System.out.println("The b1 static amount is "+b1.amount);
		System.out.println("The b2 static amount is "+b2.amount);
		System.out.println("Class level amount is also "+Bank_static.amount);

	}

}
//1.static keyword  can allow us to use the class elements(like 'amount' here) without making objects in our main method. So, if we have to access
//the 'amount' in our main method, we can do it without 'b1' and 'b2' class objects.
//2.If we make any change in the 'static' element, it will be reflected in all the elements where static has been used. So, we make change in amount for
//'b1', it will be changed for the amount of 'b2' as well. Thats the difference betn 'instance' and 'static'.
