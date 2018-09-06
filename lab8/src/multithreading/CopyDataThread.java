package multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	private FileInputStream in;
	
	
public CopyDataThread(FileInputStream in) {
		super();
		this.in = in;
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	byte[] buffer;
	try{
		buffer=new byte[in.available()];
		in.read(buffer);
		FileOutputStream out=new FileOutputStream("d:/data/traget.txt");
		for(int i=0;i<buffer.length;i++){
			out.write(buffer);
			if(i%10==0){
				System.out.println("10 characters printed");
				System.out.print((char)buffer[i]);
				Thread.sleep(5000);
//				for (byte b : buffer) {
//					System.out.print((char)b);
//				}
			}
		}
		
		System.out.println("file successfully copied");
		in.close();
		out.close();
	}catch(IOException e){
		e.printStackTrace();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	
	
}


//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		FileInputStream in= new FileInputStream("d:/data/source.txt");
//		FileOutputStream out=new FileOutputStream("d:/data/traget.txt");
//		
//		int c;
//		//in.read();
//		while((c=in.read())!=-1){
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			out.write(c);
//			System.out.print((char)c);
//		}
//		System.out.println("Characters has been copied");
//		in.close();
//		out.close();

	}







	
