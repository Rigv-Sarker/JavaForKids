package java4Kids;

public class NestedIfElse {

	public static void main(String[] args) {
		// age of the person
		int age = 9;
		
		if (age< 18) {
			if(age <10) {
				System.out.println("You can't vote :( But you can have a Lolipop! Yay! :)");
			}else {
				System.out.println("You can't vote :( But you can have a Chocolate, Yay! :)" );
			}	
			
		}else if (age >= 18) {
			System.out.println("You can Vote :)");
		}else {
			System.out.println("Try again!");
		}

	}

}
