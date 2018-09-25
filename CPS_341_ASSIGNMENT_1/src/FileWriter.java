import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		writeContents();
	}

	private static void writeContents() throws IOException {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file.txt"), "utf-8"))) {
			writer.write("Embedded systems run on the computers that control devices that are not generally\n"
					+ "thought of as computers and which do not accept user-installed software.\n"
					+ "Typical examples are microwave ovens, TV sets, cars, DVD recorders, traditional\n"
					+ "phones, and MP3 players. The main property which distinguishes embedded systems\n"
					+ "from handhelds is the certainty that no untrusted software will ever run on it.\n"
					+ "You cannot download new applications to your microwave oven—all the software\n"
					+ "is in ROM. This means that there is no need for protection between applications,\n"
					+ "leading to design simplification. Systems such as Embedded Linux, QNX and\n"
					+ "VxWorks are popular in this domain");
		}
	}
}
