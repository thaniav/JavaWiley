package streams;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Reader reader=new FileReader("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
			int data=reader.read();
			
			while(data!=-1) {
				System.out.print((char) data);
				data=reader.read();
			}
			reader.close();
		}
catch(FileNotFoundException e) {
System.out.println("Exception raised");
}
		catch(IOException e) {
			e.printStackTrace();
			}
	}

}
