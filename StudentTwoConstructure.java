package MyClasses;

public class StudentTwoConstructure {

	int a;
	double b;
	
	public StudentTwoConstructure() {
		// TODO Auto-generated constructor stub
		a = 10;
		System.out.println(a);
		System.out.println(b);
	}
	
	public StudentTwoConstructure(int a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		StudentTwoConstructure c1 = new StudentTwoConstructure();
		StudentTwoConstructure c2 = new StudentTwoConstructure(19,31.45);
		
	}

}
