package org.samox;

public class Nancons1 {
	public Nancons1() {
		this("java");
		System.out.println("default cons");
		
	}

	public Nancons1(String name) {
		this(10);
		System.out.println(name);
	}

	public Nancons1(int id) {
		this(456.678f); 	
System.out.println(id);	
}
	public Nancons1(float sal) {
		System.out.println(sal);
		
	}
	public static void main(String[] args) {
		Nancons1 v=new Nancons1();
	}

}
