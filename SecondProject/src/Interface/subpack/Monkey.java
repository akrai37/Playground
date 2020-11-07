package Interface.subpack;

public class Monkey extends Tiger implements Animal_Itrface{ //'Monkey' is another subclass of Interface 'Animal_Itrface'. Here, we can see that 'Monkey' class can extend a parent class and.cont
	                                                         // at the same time it can use or 'implements' an Interface. 
	@Override
	public void run() {
		System.out.println("Monkey runs and jumps.");
	}

	@Override
	public void eat() {
		super.eat();      //Since, this class is extending another class(parent class), we can call the methods of that class. If we don't have an object of the current class, we can use 'super' to call the methods of parent class.
		System.out.println("Monkey eats bananas and other fruits.");
	}

	public static void main(String[] args) {
		Monkey m= new Monkey();
		m.run();
		m.eat();
	}

}
