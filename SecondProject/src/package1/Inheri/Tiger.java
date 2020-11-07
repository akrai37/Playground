package package1.Inheri;

public class Tiger extends Animal{ //Single level inheritance.
    
	int legs=2;
	Tiger(){
		super(6);  
		System.out.println("child class constructor.");
	}
	void run() {
		System.out.println("Runs fast and has "+super.legs+" legs "); //'legs' of parent class will be called with 'super'.
	}
	void eat() {                                                 
		super.eat(); //calling the eat() method of parent class. 
		System.out.println("Tiger eats only non-veg.");
	}
	public static void main(String[] args) {
		//new Tiger();  
		Tiger t=new Tiger(); //if we create an object of subclass, then it will call the constructor of the subclass as well as.cont.
							 //default constructor(no argument) of super(parent) class.	
		t.eat();  //'eat()' method of Tiger class is called. If it was not present, then 'eat()' method of parent class would have been  called.           
		t.run();
		System.out.println("Tiger has "+t.legs+" legs.");
	}
}
//1.By rules, the parent class default constructor will also be called with the child class constructor when we create an object of child class. If
//we want to call different constructor of parent class(a constr. with arguments), then we can use 'super' keyword to call that parent constructor and
//can pass the argument with the 'super' keyword.
//2.Method overriding:- If same name method is present in both parent and child class, then the child class method will be given preference.This is method overriding.
//If there are 2 methods with the same name but different arguments, then it is called method overloading.