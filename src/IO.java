import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	public void byteArray1024() {
		File file = new File("F:\\output.txt");//先決定目的地的檔案位置與檔案實例
		File file2 = new File("F:\\output2.txt");
//		try {
//			FileOutputStream out = new FileOutputStream(file);// 架往外的橋
//			FileOutputStream out2 = new FileOutputStream(file2);
//
//			byte[] buy = "一".getBytes();// byte(編碼的碼)的資訊：-28, -72, -128
//			byte[] byteArray = { -28, -72, -128 };// 換成自己寫
//			byte[] stringArr = "123".getBytes();
//			out.write(byteArray);// 寫到目的地
//			out.close();
//			out2.write(stringArr);
//			out2.close();
//			System.out.println("buy：" + buy);
//		} catch (Exception e) {
//			e.printStackTrace(); 
//		} 
		try {
			FileInputStream in = new FileInputStream(file);
			byte[] byt = new byte[1024]; // 1024是什麼意思
			int len = in.read(byt);

			System.out.println("文件中的訊息是：" + new String(byt, 0, len));// 這裡的0是什麼意思
			System.out.println("byt：" + byt);
			System.out.println("len：" + len);
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testReader() {
		File file = new File("F:\\output.txt");
		try {
			FileReader fileReader = new FileReader(file);
			char[] charArry = new char[1024];
			int len = fileReader.read(charArry);
			System.out.println("charArry：" + charArry);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void dump(InputStream src, OutputStream dest) throws IOException {
		byte[] data = new byte[1024];// 8-bits=1 byte的有1024個
		int length;
		while ((length = src.read(data)) != -1) {
			System.out.println("data : " + data + "; length : " + length);
			dest.write(data, 0, length);
			System.out.println("data : " + data);
		}
	}

	// 讀寫"檔案"=>問題：檔案以外還有什麼可以讀寫的？
	public void readAndWriteFile() throws IOException {
		// 先定義橋的變數
		FileInputStream in = null;
		FileOutputStream out = null;
		FileReader ir = null;
		FileWriter or = null;

		try {
			// 檔案的實例，先定位
			File file1 = new File("F:\\input.txt");
			File file2 = new File("F:\\output.txt");

			// 架橋，把來源檔與目的檔資訊放入
//			in = new FileInputStream(file1);
//			out = new FileOutputStream(file2);
			ir = new FileReader(file1);
			or = new FileWriter(file2);
			int c;
			// 對吸管與來源物吸，一次吸一個byte，一個中文字三個byte，一個byte可能是"230"這樣的數字，"我"="230 136 145"
			// "A"="65"
			// 1 byte = 8 bits，1 bit = 0 or 1
			while ((c = ir.read()) != -1) {
				System.out.println("c : " + c);
				// 把每一個byte給寫入吸管與目的物
				or.write(c);
			}
		} finally {
			if (ir != null) {
				ir.close();
			}
			if (or != null) {
				or.close();
			}
		}
	}

	public void readAndWriteByBuffer() throws IOException {
		FileReader ir = null;
		FileWriter or = null;

		File file1 = new File("F:\\input.txt");
		File file2 = new File("F:\\output.txt");

		ir = new FileReader(file1);
		or = new FileWriter(file2);

		BufferedReader br = new BufferedReader(ir);
		BufferedWriter bw = new BufferedWriter(or);

		String dataStr;
		while ((dataStr = br.readLine()) != null) {
			System.out.println("dataStr : " + dataStr);
			bw.write(dataStr);
		}

		bw.close();
		br.close();
		or.close();
		ir.close();
	}

	public static void main(String args[]) throws IOException {
		IO io = new IO();
		// io.byteArray1024();
		io.testReader();
		// io.readAndWriteFile();
		//io.readAndWriteByBuffer();
//		FileInputStream in = null;
//		FileOutputStream out = null;
//
//		try {
//			int c;
//			File file1 = new File("F:\\input.txt");
//			File file2 = new File("F:\\output.txt");
//			in = new FileInputStream(file1);
//			out = new FileOutputStream(file2);
//			while ((c = in.read()) != -1) {
//				System.out.print(c + " ");
//				out.write(c);
//			}
//			System.out.println("File exists ? " + file1.exists());
//			System.out.println("Class : " + file1.getClass());
//			System.out.println("Name : " + file1.getName());
//			System.out.println("Parent : " + file1.getParent());
//			System.out.println("Path : " + file1.getPath());
//			System.out.println("AbsolutePath : " + file1.getAbsolutePath());
//		} finally {
//			if (in != null) {
//				in.close();
//			}
//			if (out != null) {
//				out.close();
//			}
//		}
	}
}
