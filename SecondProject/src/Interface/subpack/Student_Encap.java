package Interface.subpack;

public class Student_Encap {//In order to access private elements of a parent class, there are two methods:- 1.using getter and setter methods 2.using constructor       
	
	private int id;
    private String name;
	
    public Student_Encap(int id, String name) {  //We can access the 'private' using constructor as well with the help of 'this' keyword.   
    	
		this.id = id;      //the passed value from the subclass will be assigned to the 'id' variable of this class.
		this.name = name;
	}                                                              

    //Below are getter and setter methods, both each for our private variables. getter and setter are alternatives for constructor.
    public void setId(int id) {
		this.id = id;    // the passed value from the subclass will be assigned to the 'id' variable of this class,just like in constructor above.
	}
	public int getId() { //
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	   
}
       
//We can input our data from the subclass by calling the 'set' method of that variable with arguments and using 'this' keyword, the values will be then assigned to our parent class variables.
// Then in the subclass, we can call 'get' method for the same and with that, we would be able to access the private variables of parent class indirectly.




