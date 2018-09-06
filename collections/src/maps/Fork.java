package maps;

class Fork {
	public static void main(String[] args) {
		/* Days d1 = Days.TH;
		 Days d2 = Days.M;
		 for(Days d: Days.values()) {
		if(d.equals(Days.F)) break;
		 d2 = d;
		 }
		 System.out.println((d1 == d2)?"same old" : "newly new");
		 }
		 enum Days {M, T, W, TH, F, SA, SU};*/
		 
		 String color="red";
		 
		 switch(color){
		 case "red":
			 System.out.println("found red");
		 case "blue":
			 System.out.println("found blue");
			 break;
		 case "white":
			 System.out.println("found white");
			 break;
			 default:
				 System.out.println("not found");
				 break;
			 
		 }
		 
		 /*int j=0;
		 int k=0;
		 for(int i=0;i<2;i++){
			 do{
				 k=0;
				 while(k<4){
					 k++;
					 System.out.println(k+ "");
				 }
				 System.out.println("");
				 j++;
			 }while(j<3);
			 System.out.println("---");
		 }
		 int[] xx=null;
		 for(int ii:xx){
			 System.out.println(ii);
		 }*/
		 
		 
		 int [] array={1,2,3,4,5};
		 System.arraycopy(array, 2, array, 1, 2);
		 System.out.println(array[1]);
		 System.out.println(array[4]);
	}}