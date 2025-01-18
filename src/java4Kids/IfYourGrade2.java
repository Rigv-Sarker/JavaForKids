
package java4Kids;

public class IfYourGrade2 {

	public static void main(String[] args) {
		int grade = 20;
		if (grade>0 && grade <= 2) {  
			System.out.println("You go to WEBER!");

		} else if (grade >2 && grade <= 5) {
			System.out.println("You go to TRUEMAN!"); // 3 TO 5

		} else if(grade >5 && grade<9){
			System.out.println("You go to MIDDLE SCHOOL!");
		}else if (grade >9 &&grade<13){
			System.out.println("You go to HIGH SCHOOL!");
		}else {
			System.out.println("Invalid INPUT!");
		}
	}

}
