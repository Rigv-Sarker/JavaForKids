package java4Kids;

public class Method5_withParameter {

	public static void main(String[] args) {

		additionWithParameter(13, 60);
		additionWithParameter(50, 90);
		System.out.println("Done");
	}

	static void additionWithParameter(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);

	}

}
