package com.cg;

class Hello {
public static void main(String[] args) {
	System.out.println("Hello.."+args[1]);
}
}
public class World
{
	public static void main(String args[]) {
		Hello.main(args);
	}
}
