package java4Kids;

public class Method {
	// Instance variable 
	static String y="Hello world";
	static int w=1000000000;
	static int v=1000;
	
	// main method starts
	public static void main(String[] args) {
		String l="I love Java";
		System.out.println(l);
		System.out.println(y);
		System.out.println(v+w);
		
		addition(); // call the addition method
		grade();
		sub();
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
	// sub method
	static void sub(){
	int x =100;			//local variable	
	int s =20;			//local variable
	int a =(x-s);
	System.out.println(a);
	}
	
	
}
