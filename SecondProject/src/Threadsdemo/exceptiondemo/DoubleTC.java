package Threadsdemo.exceptiondemo;
import java.util.Scanner;

public class DoubleTC {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:-");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int myarr[]= {56,10,48,93,54};
		try {
			System.out.println("The division of the numbers are "+(x/y));
		}
		catch(ArithmeticException randomvariable) {
			System.out.println(randomvariable);
		}
		try {
			System.out.println(myarr[12]);
		}
		catch(ArrayIndexOutOfBoundsException anyvariable){    
			System.out.println(anyvariable);
		}
		finally {      //If we didn't have try-catch to catch the exception, the program would stop after displaying the exception in the console.If we want to execute something.cont
			System.out.println("This is necessary to close a resource."); //even though the program has stopped, then we can use 'finally'.
		}
		System.out.println("Try-catch blocks got over anfd program continued.");

	}

}
//1.Most of the exceptions in java are pre-defined. Ex:-ArithmeticException,ArrayIndexOutOfBoundsException -They have been defined previously.
//2.We create try-catch for each exception that we could have. It is not possible to have more than 2 exceptions in the same try because if both
//the exceptions are required to be catched at the same time, it won't do it. It will only catch the first exception and ignore the rest.





