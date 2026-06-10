package ControlStatement;

public class partone {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		if(a == 10) {
			System.out.println("true");
		}
		
		int b = 11;
		
		if(b == 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(a == 11) {
			System.out.println("true a");
		} else if(b == 11) {
			System.err.println("true b");
		} else {
			System.out.println("false");
		}
		
		switch(a + b) {
			case 20:
				System.out.println("out put 1");
				break; // it is important to terminate
			case 21:
				System.out.println("out put 2");
				break;
				default:
				System.out.println("error");
		}
		
		if(a == 10) {
			if(b == 11) {
				System.out.println("pass");
			}
		}
		
		
		while(a<=10) {
			System.out.println("value of a is " + a);
			a++;
		}
		
		do {
			System.out.println("inside do while loop value of a is " + a);
		} while(a == 10);
		
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			
			if(i == 4) {
				break;
			}
			
		}
		


		for(int i = 0; i <= 10; i++) {
			
			if(i == 4) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		
		System.out.println("program end");
	}

}
