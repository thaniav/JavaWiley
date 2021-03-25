package streams;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer w;
		try {
			w = new FileWriter("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
			String cont = "Hello world";
			w.write(cont);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			System.out.println("Exception raised");

		}

	}

}
