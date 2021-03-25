package streams;
import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		FileInputStream fout = new FileInputStream("C:\\Users\\Thania\\wiley\\wiley\\src\\streams\\ABC.txt");
		ObjectInputStream in=new ObjectInputStream(fout); 
		Student s = (Student) in.readObject();
				System.out.println(s.id+" "+s.name);
				
		in.close();
		}
		catch (FileNotFoundException e) {

			System.out.println(e);
		}

		catch (IOException e) {

			System.out.println(e);
		}
				
				
		
	}

}
