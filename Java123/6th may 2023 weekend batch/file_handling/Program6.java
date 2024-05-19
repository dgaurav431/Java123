package file_handling;
import java.io.*;
public class Program6 {
	public static void main(String[] args) throws IOException {
		File f1=new File("f:\\p3.txt");
		f1.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(f1);
		
		fos.write(100);
		fos.write("Mohan is here".getBytes());
		byte[] k= {65, 66, 67, 68, 69, 70, 71, 72, 73};
		fos.write(k);
		fos.write(k, 2, 3);
	}

}
