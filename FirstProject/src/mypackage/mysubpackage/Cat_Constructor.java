package mypackage.mysubpackage;

public class Cat_Constructor {

    Cat_Constructor() 
    {
       this(4);	
	   System.out.println("Constructor of Cat class.");
	};
    Cat_Constructor(int x) 
    {
	   System.out.println("Another Constructor of Cat class but it has 'x' as argument:- "+x);
	   this.eat();
    };
	void eat() 
	{
	   System.out.println("Cats eats rats.");
	   eat(7);
	}
	void eat(int x)         
	{
	   System.out.println("Cats eats "+x+" rats.");	
	}
    
	public static void main(String[] args) 
	{
       //Cat_Constructor obj=new Cat_Constructor();
	   new Cat_Constructor(); //No need to store the newly created object because there is no use of it.
	}

}

//Note:- If we don't want to create a separate object for each and every Constructor in our main file, then we use 'this' keyword
//       like above. The 'this' keyword should be written in the beginning and cannot be written later in the code. 'this' can also 
//       be used for calling methods in the constructor but it is not necessary.








