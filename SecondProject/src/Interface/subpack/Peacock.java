package Interface.subpack;

public class Peacock implements Bird_Itrface{

	@Override
	public void eat() {
		System.out.println("Peacock eats veggy stuff.");
		
	}
	@Override
	public void fly() {
		System.out.println("Peacock can also fly.");
	}
	
	public static void main(String[] args) {
		Peacock p=new Peacock();
		p.eat();
		p.fly();
		
	}
}
