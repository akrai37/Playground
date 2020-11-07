package Interface.subpack;

public class User_encap {

	public static void main(String[] args) {
		
       Student_Encap s1=new Student_Encap(101,"Ramesh"); //if we are using constructor to access private variables, then we have to pass the values while declaring the object of parent class like here.
   
//Below are the 'set' methods of 'Student' class that we are calling along with passing the arguments.
       s1.setId(564);      
       s1.setName("Jason");
       
//After the values have been set by the respective 'set' methods, we can call 'get' methods.       
       System.out.println("The student id is "+ s1.getId());
       System.out.println("The student name is "+ s1.getName());
       
	}

}
//1.It is also possible to create an object of class without inheriting it, like we did above(Didn't know that!).
