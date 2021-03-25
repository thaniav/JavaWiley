package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter wr = new FileWriter("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt",true);
			BufferedWriter b = new BufferedWriter(wr);
			String cont = "Thania Vivek";
			wr.write(cont);
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
