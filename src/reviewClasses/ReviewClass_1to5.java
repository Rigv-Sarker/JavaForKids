package reviewClasses;

public class ReviewClass_1to5 {

	public static void main(String[] args) {
		add(1000, 100, 12200);
		sub();
	}

	static void add(int num1, int num2, int num3) {
		int sum = (num1 + num2 + num3);
		System.out.println(sum);
	}

	static void sub() {
		int x = 100000;
		int v = 1000;
		int diff = (x - v);
		System.out.println("Difference is "+ diff+ ".");  //Difference is ____.
	}
}
