package office1;
import java.io.*; 

class FileOutputStreamTest {
	public static void main (String args[]){
		try {
			FileOutputStream out = new FileOutputStream
					("myFile.dat");
			out.write('H');
			out.write(69);
			out.write(76);
			out.write('L');
			out.write('O');
			out.write('!');
			out.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error:Cannot open file for writing.");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error:Cannot write to file.");
		}
	}
}
