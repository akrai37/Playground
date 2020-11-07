package Interface.subpack;

public class Driver extends Truck_Absclass{ //We use the keyword 'extends' to extend abstract class.(just like in inheritance)
	
	public void brandname() {
		System.out.println("It will override the abstract class 'brandname'.");
	}
	@Override
	public void start() {
		System.out.println("Truck starts from 0. ");
	}
	@Override
	public void stop() {
		System.out.println("Truck stops after some time. ");
		
	}
	@Override
	public void acceleration() {
		System.out.println("Truck  accelerates slowly.");
	}
	
	public static void main(String[] args) {
		
		Driver d=new Driver();
		d.start();
		d.stop();
		d.acceleration();
		d.brandname();
		d.color();
	}

}
