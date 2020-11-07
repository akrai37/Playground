package pack1.pack2;
import java.util.Scanner;     //Scanner is used to take the input from users.      

public class Javainput {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  //It is necessary to create an object of "Scanner" class for taking the input from user.
		System.out.println("Enter the id number");
		int id_no=sc.nextInt();      //This is the format for taking the input from user.This input is of integer type. For integer inputs, we use "obj_of_scanner.nextInt()"   
		System.out.println("Enter the name");
		String name=sc.next();       //This input is of String type. we use "obj_of_scanner.next()"
		                                                           
		if((id_no==44)&&(name.equals("John"))){
			System.out.println("valid user");
		}
		else if((id_no==44)||(name.equals("John"))){
			System.out.println("Either id or name is invalid.");
		}
		else {
			System.out.println("invalid user");
		}
		
	}
}
//1.Here, by writing Scanner s, we are declaring s as an object of Scanner class. 
//2.'System.in' within the round brackets tells Java this will be System Input i.e. input will be given to the system.