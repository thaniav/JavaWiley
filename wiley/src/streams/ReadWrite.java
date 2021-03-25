package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter content");
		
		String cont = sc.nextLine();
		
		FileWriter w;
		try {
			w = new FileWriter("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
			
			w.write(cont);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			System.out.println("Exception raised");

		}
		
		
		
		try {
			reader=new FileReader("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
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
