package lambdastream;




public class Lab11_1 {
	interface Expression{
	public double getvalue(double x,double y);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression g=(x,y)->Math.pow(x,y);
		double c=g.getvalue(2, 4);
		System.out.println(c);
		
		

	}

}
