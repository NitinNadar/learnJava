package MyClasses;

public class StudentTwo {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//type-casting
		//Assigning a value of one type to another is know as type casting
		
		int i = 10;
		long il = i;
		
		System.out.println(il);
		
		//implicit -- automatic type casting
		//byte -> short -> int -> long -> float -> double
		//explicit - larger type to value to a variable of 
		//smaller type then need to perform explicit type
		
		 double d = 100.80;
		 int b = (int) d;
		 
		 System.out.println(b);
		
		
		
	}

}
