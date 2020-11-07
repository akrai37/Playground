package package1.Inheri;

public class Animal { //It is a super class.
	
	Animal(){   //It is a default constructor.
		System.out.println("super class default constructor. ");
	}
	Animal(int x){ //It is a constructor with an argument.
		System.out.println("super class constructor with an argument- "+x);
	}
	
	int legs=4;
	
	void eat() {
		System.out.println("Animals eat veg and non veg.");
	}
}

//1. 'this' and 'super' dosen't work for static methods. Theyonly work for instance method.
//2. 'super' can be used to call methods of parent class without object. 'this' can be used to call methods of current class.
//3. Java doesn't support multiple inheritance. Why? In the child class, if you use 'super' keyword to call one of the parent class method, 
//   then the JVM will get confused about from which parent class method to inherit bec. there are more than one extended class. The alternative is interface.