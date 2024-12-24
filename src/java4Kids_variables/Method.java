package java4Kids_variables;

public class Method {
	// Instance variable 
	static String y="Hello world";
	static int w=1005;
	static int v=1000;
	
	// main method starts
	public static void main(String[] args) {
		String l="I love Java";
		System.out.println(l);
		System.out.println(y);
		System.out.println(v+w);
		
		addition(); // call the addition method
		grade();
	} // main method ends
	
	// access modifier  --> optional 
	// static or non-static --> optional
	// return --> must
	// method name --> must
	
	// method is also known as function
	// declare a new method except main method 
	static void addition(){
		int x = 10;
		int y = 330;
		int z = x+y;
		System.out.println(z);
	}

	// grade method
	static void grade() {
		int g = 1;
		System.out.println("I am in grade "+g);
	}
	
	
	
}
