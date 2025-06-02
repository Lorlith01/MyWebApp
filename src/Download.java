import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Download {
	public static void main(String[] args) throws IOException {
		URL url = new URL(args[0]);
		InputStream src = url.openStream();
		FileOutputStream dest = new FileOutputStream(args[1]);
		IO.dump(src, dest);
	}

}
