package MyClasses;

public class Student {
	// class members
	// variables --- state
	// methods --- behaviour
	
	static int b = 10;
	
	int rollNumber = 100;
	
	public void dispaly() {
		System.out.println("Presnet");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		//classname objectname = new classname();
		Student stud1 = new Student();
		
		stud1.dispaly();
		
		System.out.println(b);
		
	}
	
}
