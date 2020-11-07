//BO:- byte-oriented
package readwrite.iodemo;
import java.io.*;

public class BufferreadingBO {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:-");
		String myname=br.readLine();
		System.out.println("Hi "+myname+", Welcome to core java");
		
	}

}

//The InputStreamReader class of the java.io package can be used to convert 'data in bytes' into 'data in characters'.It extends the abstract class Reader.
//The InputStreamReader class works with other input streams. It is also known as a bridge between byte streams and character streams. 
//This is because the InputStreamReader reads bytes from the input stream as characters.
//For example, some characters required 2 bytes to be stored in the storage. To read such data we can use the input stream reader that reads the 2 bytes together and converts into the corresponding character.