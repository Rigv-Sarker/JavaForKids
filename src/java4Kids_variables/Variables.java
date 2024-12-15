package java4Kids_variables;
// Lesson 3: Variables

public class Variables {
	
// static = if can call without additional step (will talk later)
// int = variable type declaration
// x = variable name
// 5 = value of x
	
	// Primitive Variable 
	static byte by= 126;
	static short sh= 256;  // short type
	static int x = 5313246;  // int type	
	static long lo = 1234567890;
	static char ch = 'A';
	static boolean bo = true;
	static float fl = 1.23f;
	static double db= 1.23456;
	
	// non-primitive variable
	static String name = "Rigv Sarker";

	
	
//	static String st = "I love Pizza!";
	
	public static void main(String[] args) {
		// task 1: print the value of x
		System.out.println("My byte value is: " + by);	
		System.out.println("My int value is: " + x);	
		System.out.println("My short value is: " + sh);	
		System.out.println("My long value is: " + lo);
		System.out.println("My char value is: " + ch);
		System.out.println("My boolean value is: " + bo);
		System.out.println("My  double value is: " + db);
		System.out.println("My  float value is: " +fl );
		
//		if (st=="I love Pizza!") {
//			System.out.println(st);
//		}else {
//			System.out.println("Not true");
//		}
		
	}
}
