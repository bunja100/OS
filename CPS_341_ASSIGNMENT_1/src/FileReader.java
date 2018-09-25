import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	  public static void main(String[] args) throws IOException {
	        readFileContents("file.txt");
	    }
	  
	  public static String readFileContents(String file) {
		  String output = "";
		    try {
		      Scanner sc = new Scanner(new File(file));
		      while (sc.hasNext()) {
		        output += sc.nextLine().concat("\n");
		      }
		      sc.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
			return output;
		  }
}
