package classlibraries;




public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accept a string");
		String s="core java ";
		s=s.concat("basic fundamentals");
		System.out.println(s);
		
		 System.out.println("Convert odd positions to #");
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		
	    StringBuilder sb = new StringBuilder(s);

	    for(int i=0; i<s.length(); i++){
	        char currC = s.charAt(i);

	        int idx = alpha.indexOf(currC);
	        if (idx != -1) 
	        if (i%2==1)

	            {
	        sb.setCharAt(i, '#');
	        }

	    }
	    System.out.println(sb);
	    
	    System.out.println("Convert the odd positions to uppercase");
	   char fg[]= s.toCharArray();
	    for(int j=0; j<s.length(); j++)
	       {
	    	   
	    	  
	    	   if (j%2 != 0)
	    	   {
	    		  fg[j]=Character.toUpperCase(fg[j]);

	    	   }
	    	   
	       }
	    System.out.println(fg);
	    
	    System.out.println("Remove the duplicate strings");
	    
	    int l = s.length();
        char chr;
        String str="";
         
        for(int i=0; i<l; i++)
        {
            chr = s.charAt(i);
            if(chr!=' ')
                str = str + chr;
            s = s.replace(chr,' '); 
        }
 
       System.out.println(str);
       
     

	  
	}
		
		

} 
	
