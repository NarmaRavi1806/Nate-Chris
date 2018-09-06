package login;

public class Mainabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childabs c=new Childabs();
		c.buyaudi();
		c.constructhouse();
		c.buyferrari();
		
		
		c.buyakshaytechpark();
		
		Fatherabs fa=new Childabs();//implicit casting or up casting
		fa.buyaudi();
		fa.buyferrari();
		fa.constructhouse();
		

	}

}
