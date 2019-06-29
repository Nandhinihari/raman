package org.samox;

public class Constrtest {
	public Constrtest() {
		this(10);
		System.out.println("default co");
	}
	public Constrtest(int id) {
		this("javs");
		System.out.println(id);
	}
	public Constrtest(String name) {
	this(567.8f);
	System.out.println(name);
	}
	public Constrtest(float f) {
		System.out.println(f);
	}
	public static void main(String[] args) {
		
	
	Constrtest c=new Constrtest();
	
}
}

