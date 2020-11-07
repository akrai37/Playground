//BO:- byte-oriented
package readwrite.iodemo;
import java.io.*;

public class WritingBO {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("E:\\documents\\A.txt");
		String msg= "Welcome to java. We are writing something into it.";
		byte b[]=msg.getBytes();
		fos.write(b);
		System.out.println("file written sccessfully..");
		fos.close();
	}

}

//Java FileOutputStream is an output stream used for writing data to a file.
//If you have to write primitive values into a file, use FileOutputStream class. 
//You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, 
//it is preferred to use FileWriter than FileOutputStream.