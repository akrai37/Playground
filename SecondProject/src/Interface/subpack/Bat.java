package Interface.subpack;

public class Bat implements Animal_Itrface,Bird_Itrface{     //here, we have used 2 Interfaces which is possible unlike in inheritance.
	//All the methods declared in both 'Animal_Itrface' and 'Bird_Itrface' Interfaces should be defined in the subclass compulsorily.The 'eat()' method has been declared in both the Interfaces,
	//so it is allowed to define only once as we are using Interfaces and NOT inheritance.
	
	@Override
	public void fly() {
		System.out.println("Bats fly in nights.");
	}

	@Override
	public void run() {
		System.out.println("Bats run slowly.");
	}

	@Override
	public void eat() {
		System.out.println("Bats eat small insects.");
		}
	
	public static void main(String[] args) {
	   Bat b= new Bat();
	   b.fly();
	   b.run();
	   b.eat();
	}
}
