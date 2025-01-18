package java4Kids;

public class Conditionals {

	public static void main(String[] args) {

		int x = 110;  // your number 
		int y = 121;  // comparison number
		
		if(x==y) {
			System.out.println("Numbers are equal!");
		}else if (x < y) {
			System.out.println("Your number is " + x + " and lesser than " + y);
		} else {
			System.out.println("Your number is " + x + " and greater than " + y);
		}

	}

}
