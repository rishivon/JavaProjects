import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Ask how many new students we want to add
		System.out.println("Enter number of new students: ");
		Scanner scanner = new Scanner(System.in);
		int numStudents = scanner.nextInt();
		
		Student[] studentArray = new Student[numStudents];
		for (int x = 0; x < numStudents; x++) {
			studentArray[x] = new Student();
			studentArray[x].enrollCourses();
			studentArray[x].viewBalance();
			studentArray[x].payTuition();
			studentArray[x].ShowInfo();
		}
	}
}
