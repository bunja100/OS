import java.io.IOException;
import java.util.Scanner;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		writeContents();
	}

	private static void writeContents() throws IOException {
		try (FileWriter fileWriter = new FileWriter("file.txt")) {
			fileWriter.write("Embedded systems run on the computers that control devices that are not gen-\n"
					+ "erally thought of as computers and which do not accept user-installed software.\n"
					+ "Typical examples are microwave ovens, TV sets, cars, DVD recorders, traditional\n"
					+ "phones, and MP3 players. The main property which distinguishes embedded sys-\n"
					+ "tems from handhelds is the certainty that no untrusted software will ever run on it.\n"
					+ "You cannot download new applications to your microwave oven—all the software\n"
					+ "is in ROM. This means that there is no need for protection between applications,\n"
					+ "leading to design simplification. Systems such as Embedded Linux, QNX and\n"
					+ "VxWorks are popular in this domain");
		}

	}
}
