package streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class PrintWriterDemo{
	public boolean appendData() throws IOException {
        BufferedWriter writer = null;
        PrintWriter printWriter = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:\\\\Users\\\\Thania\\\\wiley\\\\wiley\\\\src\\\\streams\\\\ABC.txt", true));
            printWriter = new PrintWriter(writer);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data to be appended:");
            String content = sc.nextLine();
            printWriter.println(content);
            printWriter.close();
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriterDemo pw=new PrintWriterDemo();
		pw.appendData();
		
	}

}
