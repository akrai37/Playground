package Interface.subpack;

public class Tiger implements Animal_Itrface{ //We use 'implements' keyword to refer to an Interface.
	
  public void run() {     //the 'run()' and 'eat()' methods were declared in the Interface and are defined in this subclass. 
	  System.out.println("Tiger runs very fast.");
  };
  public void eat() {
	  System.out.println("Tiger eats non-veg.");
  }
  
  public static void main(String args[]) {
	  
	  //Animal s; -->it is allowed since we can create the reference of interface in the subclass but.cont
	  //Animal s= new Animal(); is not allowed because we are trying to create an object of interface which is not supportable.
	  Tiger t=new Tiger();
	  t.run();
	  t.eat();
	  System.out.println(Animal_Itrface.legs); //'Animals.legs++' won't work. (Interface variables are static and final).
  }
  
}
