//CO:-character-oriented
package readwrite.iodemo;
import java.io.*;

public class WritingdataCO {

	public static void main(String[] args) throws IOException {
		
	    FileWriter fw=new FileWriter("E:\\documents\\B.txt");
	    fw.write("Welcome to the firm. We are writing the data with 'Filewriter'.");
	    System.out.println("written sucessfully..");
	    fw.close();
	}

}

//note:-
//subclasses of Reader and Writer are for reading/writing text content. InputStream / OutputStream are for binary content. 
//If you take a look at the documentation: Reader - Abstract class for reading character streams.
//InputStream - Abstract class is the superclass of all classes representing an input stream of bytes.
//It means we can read anything with FileInputStream(like texts, songs, videos) whereas FileReader is mainly used for texts(characters).