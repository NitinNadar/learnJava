package Exception;

public class Parent {
	
	public static void main(String[] args) {
		
		System.out.println("execution start");
		
		int a;
		try {
			a = 10/0;
			System.out.println(a);
		} catch(Exception e) {
			System.out.println("process got failed");
//			e.printStackTrace();
		}
		
		System.out.println("execution end");
		
	}

}
