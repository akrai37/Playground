package pack1.pack2;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       //while loop
       System.out.println("Enter a number for while loop range:-");
       int w=sc.nextInt();
       while(w<=5) {              //If the condition is not met, the code will not execute
    	   System.out.println(w);
    	   w++;
       }
       
      //do-while loop
       System.out.println("Enter a number for do-while:-");
       int dw=sc.nextInt();
       do {                       //It guarantees aleast one execution of the code 
    	   System.out.println(dw);
    	   dw++;
       }
       while(dw<=5);
       
      //for loop
       System.out.println("Enter a for loop range:-");
       int ran=sc.nextInt();
       for(int i=0;i<=ran;i++) {
    	   if(i % 2==0) {
    		   System.out.println(i+" is even");
    	   }
    	   else {
    		   System.out.println(i+" is odd");
    	   }
       }
       
      //using for loop to print 4X3 matrix
       int myarr[][]=new int[4][3];   //This way we can create an array object and store it into our variable.The datatype is 'int'. We have to specify range while creating an object of array.cont.
       							      //ip:-The range does NOT start from 0, it starts from 1. So,if range is 4, there are 4 values that can be entered, NOT 5. 
       for(int i=0; i<4; i++) {
    	   for(int k=0; k<3; k++) {
    		   System.out.println("Enter the number for array:-");
    		   myarr[i][k]=sc.nextInt();
    	   }
       }
       for(int i=0;i<4;i++) {   //This and below loop are used to print the values in matrix format.
    	   for(int k=0;k<3;k++) {
    		   System.out.print(myarr[i][k]+" \t"); //We have used 'print' instead of 'println' which will not change line after every input in the current loop. " /t" is used to have some space betn 2 column values.   
    	   }
    	   System.out.println();     //After every above for loop, we have to change our line, so we are using the 'println' here, just to change the line.
       }
       
	}

}









