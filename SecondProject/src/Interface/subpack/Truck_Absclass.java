package Interface.subpack;

public abstract class Truck_Absclass {

	public void brandname() {
		System.out.println("Tesla");
	}
	public void color() {
		System.out.println("blue color");
	}                                     
	
	public abstract void start();    //It is necessary to use the keyword 'abstract' for declared methods.
	public abstract void stop();
	public abstract void acceleration();
	
}
//1.Abstract classes are similar to Interface except we are allowed to both declare and define the methods in it. In Interfaces, we 
//  can only declare them. The declared methods have to be defined in the subclasses.
//2.In the declared methods, it is important to write the keyword 'abstract'. In the Interface it was optional, although all the methods are
//  abstract and always will be abstract. In the defined methods of abstract class, it is also optional.
