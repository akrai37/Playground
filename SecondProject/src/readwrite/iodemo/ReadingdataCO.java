//CO:-character-oriented
//package readwrite.iodemo;
//import java.io.*;
//
//public class Readingdata {
//
//	public static void main(String[] args) throws IOException {
//		
//         FileInputStream fis=new FileInputStream("E:\\documents\\A.txt");
//         //System.out.println((char)fis.read());
//         int i=0;
//         while((i=fis.read())!=-1) {
//        	 System.out.print((char)i);
//         }
//         
//		 fis.close();
//	}
//
//}

package readwrite.iodemo;
import java.io.*;

public class ReadingdataCO {

	public static void main(String[] args) throws IOException {
		
         FileReader fis=new FileReader("E:\\documents\\A.txt"); 
         //System.out.println((char)fis.read()); //If we don't use (char), then it will only return the ASCII number of the character.
         int i=0;
         while((i=fis.read())!=-1) {
        	 System.out.print((char)i);
         }
         
		 fis.close();
	}

}


//Both FileInputStream and FileReader are used to read from the data. FileReader is character oriented.