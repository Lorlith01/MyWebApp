import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardOut {
	public static void main(String[] args) throws IOException {
		try (PrintStream file = 
				new PrintStream(new FileOutputStream(args[0]))){
			System.setOut(file);
			System.out.println("HelloWorld");
		}

	}

}
