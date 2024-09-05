package exception_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_Handling {
    
        public static void main(String[] args) {
	    PrintWriter pw;
		    try{
		        pw=new PrintWriter("Test.txt");
		        pw.write("Testing1");
                        pw.println("\nTesting2");
                        pw.close();
		    }
		catch(FileNotFoundException e){
		System.out.println(e);
		}
		System.out.println("File saved successfully");
    }
    
}
