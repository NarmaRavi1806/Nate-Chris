package multithreading;

import java.io.FileInputStream;
import java.io.IOException;

public class FileProgram extends Thread{
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("d:/data/source.txt");
		Thread t1=new Thread(new CopyDataThread(in));
		t1.start();
	}
}
