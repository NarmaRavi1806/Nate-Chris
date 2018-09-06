package login;

public class Corejavatest1 {
	public static void main(String[] args) {
		
	

	/*int [] exits = {0,0,0,0,0,0};
	int x1 = 0;
	for(int x = 0; x < 4; x++) exits[0] = x;
	for(int x = 0; x < 4; ++x) exits[1] = x;
	x1 = 0; while(x1++ < 3) exits[2] = x1;
	x1 = 0; while(++x1 < 3) exits[3] = x1;
	x1 = 0; do { exits[4] = x1; } while(x1++ < 7);
	x1 = 0; do { exits[5] = x1; } while(++x1 < 7);
	for(int x: exits)
	System.out.print(x + " ");*/
		String s = "-";
		boolean b = false;
		int x = 7, y = 8;
		if((x < 8) ^ (b = true)) s += "^";
		if(!(x > 8) | ++y > 5) s += "|";
		if(++y > 9 && b == true) s += "&&";
		if(y % 8 > 1 || y / (x - 7) > 1) s += "%";
		System.out.println(s);
} }
