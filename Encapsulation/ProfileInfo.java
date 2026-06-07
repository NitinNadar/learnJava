package Encapsulation;

public class ProfileInfo {
	
	public static void main(String[] args) {
	
		Profile p1 = new Profile();
		
		p1.setName("Jack");
		p1.setId(1);
		
		Profile p2 = new Profile();
		
		p2.setName("Mark");
		p2.setId(2);
		
		
		System.out.println(p1.getName() + ", " + p2.getName());
		
	}
	
}
