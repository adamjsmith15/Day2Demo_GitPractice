import java.util.Scanner;

public class IfElsePractice {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a numeric grade: ");
		
		int grade = scnr.nextInt();
		if(grade >= 0 && grade <= 100) {
			if(grade >= 85) {
				System.out.println("A");
			}
			else if(grade < 85 && grade >= 70){
				System.out.println("B");
			}
			else if(grade < 70 && grade >= 60) {
				System.out.println("C");
			}
			else if(grade < 60 && grade >= 50) {
				System.out.println("D");
			}else {
				System.out.println("E");
			}
		}else {
			System.out.println("Not a correct number!");
		}

		System.out.println("Goodbye!");
		
		//this is the end of the program
		scnr.close();
	}

}
