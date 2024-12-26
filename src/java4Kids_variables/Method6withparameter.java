package java4Kids_variables;

public class Method6withparameter {

	public static void main(String[] args) {
		additionWithParameter2(23, 50);
//		System.out.println("My sum is 32");  // hard-coding
	}

	static void additionWithParameter2(int x, int y) {
		int sum = (x + y);
		System.out.println("My sum is " + sum); // dynamic printing

		//
	System.out.println("My x is "+ x + ", my y is "+ y +". And my sum is "+sum+ ".");	

		System.out.println(x + " + " + y + " = " + sum);

	}

}

// X + Y = SUM
// 13 + 50 = 63
// My x is ___, and my y is ___. And, my sum is ____.