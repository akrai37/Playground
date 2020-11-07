package package1.Inheri;

public class Deer extends Tiger{

	void eat() {
	    super.eat();
		System.out.println("Deers eats grass.");
	}
	public static void main(String[] args) {
		
		Deer d=new Deer(); //By creating the object of this class, we are calling its constructor(if it is there)and also its parent's constructor.
		d.eat();
	}

}
//1.Deer extends Tiger, Tiger extends Animal, so this is multilevel inheritance.