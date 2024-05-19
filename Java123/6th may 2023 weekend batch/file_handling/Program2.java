package file_handling;
import java.io.File;
import java.io.IOException;
public class Program2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("f:\\pqr1.txt");
		f1.createNewFile();
		
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		f1.setWritable(false);
		f1.setWritable(true);
		//f1.delete();
		System.out.println(f1.length());
		
		
	}

}
