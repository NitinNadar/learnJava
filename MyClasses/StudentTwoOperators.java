package MyClasses;

public class StudentTwoOperators {
	
	public static void main(String[] args) {
		
		//Arithmetic ( '*', '+', '-', '/', '%' )
		System.out.println( 10 * 20 );
		System.out.println( 10 + 20 );
		System.out.println( 10 - 20 );
		System.out.println( 10 / 20 );
		System.out.println( 10 % 20 );
		
		// auto increment and decrement operator
		
		int a = 10;
		a++; // increment by 1
		System.out.println( a );
		
		int b = 10;
		b--; // decrement by 1
		System.out.println( b );
	
	//Relational ( '>', '<', '==', '!=', '<=', '>=' )
		
		int c = 100;
		int v = 200;
		
//		System.out.println(c > v); // c is grt then v
//		System.out.println(c < v); // c is smlr then v
//		System.out.println(c == v); // c is eq to v
//		System.out.println(c != v); // c is not-eq to v
//		System.out.println(c <= v); // c is smlr then eq to v
//		System.out.println(c >= v); // c is grt then eq to v
	
	//Logical ( '&&', '||' )
		
		int f = 10, z = 20, x = 20;
		
//		if(f == z && z == x) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
		
		if(f == z || z == x) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
