package Interface.subpack;
//'static' and 'final' methods cannot be overidden,fact.

public interface Animal_Itrface {
  	int legs=4;                 //An Interface variable is static and final.
  	public abstract void run(); //All the methods in the Interface are abstract by default. It is not necessary to use the keyword 'abstract' while declaring the method(look at eat()).
  	public void eat();

}

//1.Interface is like a template. We can declare methods but cannot define them. These methods should be defined inside the
//subclass compulsory.
//2.We can take an example of menu in the hotel. In the menu, we can only look at the names of dishes, then we order them. Interface is very similar to something like menu. 

//Note:-Difference in Static and Non-static variables-
//A static variable acts as a global variable and is shared among all the objects of the class. It can be used to refer to the common properties of object.
//A non-static variable is specific to instance object in which they are created. Static variables occupy less space and memory allocation happens only once.
//final variable:- A final variable always contains the same value.