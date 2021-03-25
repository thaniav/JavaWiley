package streams;
import java.io.*;

import java.util.*;
public class BufferedInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream w;
		try {
			System.out.println("**Writing**");
			w = new FileOutputStream("C:\\\\Users\\\\Thania\\\\wiley\\\\wiley\\\\src\\\\streams\\\\ABC.txt");
			BufferedOutputStream br = new BufferedOutputStream(w);
			String data = "My name is Thania Vivek.";
			byte b[]=data.getBytes();
			br.write(b);
			br.close();
			System.out.println("**Written Successfully**");
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
		try {
			System.out.println("**Reading**");
			FileInputStream f=new FileInputStream("C:\\\\Users\\\\Thania\\\\wiley\\\\wiley\\\\src\\\\streams\\\\ABC.txt");
			BufferedInputStream r = new BufferedInputStream(f);
			int Rdata;
			while ((Rdata = r.read()) != -1) {
				// Rdata=r.readLine();
				System.out.print((char)Rdata);
			}
			r.close();
			System.out.println("\n**Reading Done**");
		} catch (FileNotFoundException e) {
			System.out.print("Error" + e);
			// e.printStackTrace();
		} catch (IOException f) {
			System.out.println("Exception " + f);
		}
	}

}