package classlibraries;

import java.util.Arrays;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sb=new String[]{"core", "java",  "stack" ,"full","cat"};
		Arrays.sort(sb);
		
		for(int i=0; i < sb.length; i++){
			System.out.println(sb[i]);
		}
		int f=sb.length;
		for(int j=0;j<(f/2)+1;j++)
		{
			System.out.println(sb[j].toUpperCase());
		}
		for(int j=(f/2)+1;j<f;j++)
		{
			System.out.println(sb[j].toLowerCase());
		}

		
	}

}
