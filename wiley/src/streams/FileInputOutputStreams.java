package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream wr = new FileOutputStream("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
			
			String cont = "Thania Vivek";
			byte b[]=cont.getBytes();
			wr.write(b);
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//

		try {
			FileInputStream reader = new FileInputStream("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
			
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
