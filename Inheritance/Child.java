package Inheritance;

public class Child extends Parent {
	
	// Inheritance, Polymorphism
	
	String childname = "Alex";
	
	public void display() {
		System.out.println( childname + ", " + fathername);
	}
	
	
	// Polymorphism -- method overloading 
	public void display1() {
		System.out.println("display1");
	}
	
	public void display1(int a) {
		System.out.println("display2");
	}
	
	public void display1(int a, double b) {
		System.out.println("display3");
	}
	
	public void display1(String name) {
		System.out.println("display4");
	}
	
	

	// Polymorphism -- method riding
	public void show() {
		System.out.println("child node");
	}
	
	
	public static void main(String[] args) {
		
		Child c1 = new Child();
		Parent p1 = new Parent();
		
		Parent p2 = new Child(); // dynamic polymor.....
		
		c1.display();
		c1.display1();
		
		c1.show();
		p1.show();
		
		p2.show();
		
		
	}

}
