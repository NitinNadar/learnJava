package MyClasses;

public class StudentTwoMethods {
	
	 // Syntax for creating a method
	 // modifire returntype nameofmetho ( parameter list ){}

	// *** Static 
	
	//Method without void
	public static void display() {
		System.out.println("Hello!!!");
	}
	
	//Method without return type
	public static int displayNum() {
		int c = 10 + 60;
		return c + 30;
	}
	
	public static int addNum(int a, int b) {
		return a + b;
	}
	
	// *** Object
	
	public void printValue() {
		System.out.println("Hello Word!!!!");
	}
	
	public static void main(String[] args) {
		
		//static
		display();
		System.out.println(displayNum());
		System.out.println(addNum(20, 30));
		
		//object
		StudentTwoMethods objectOne = new StudentTwoMethods(); // default constructure
		
		objectOne.printValue();
	}

}
