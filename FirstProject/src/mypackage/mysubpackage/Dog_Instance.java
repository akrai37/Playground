package mypackage.mysubpackage;
import java.io.File;

public class Dog_Instance {
    int legs=4; //Instance variable(stored in the temporary memory)
    void eat() { //Instance method(stored in the temporary memory)
    	System.out.println("Dog loves raw meat.");
    }
	public static void main(String[] args) {
		Dog_Instance sheru= new Dog_Instance(); //creating an object of our class i.e "sheru".'new' keyword means we are assigning the data into brand new memory. 
		sheru.eat(); //calling an instance method of our class using dot notation. 
		System.out.println("sheru has "+sheru.legs+ " legs and loves food!");
				
	}
}
