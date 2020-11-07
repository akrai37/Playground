package pack1.pack2;

public class Static_outside {

	
	 public static void main(String[] args) {
	    System.out.println("This is a main class."); 
	  }
	 
	static {
		System.out.println("This is a static method defined outside of main class.");
		System.exit(0); //It will completely terminate the program here.(won't go to 'main' method)
	}

}
