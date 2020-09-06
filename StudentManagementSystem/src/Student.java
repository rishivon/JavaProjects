import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private String gradeName;
	private String studentID;
	private String courses = "";
	private int balance;
	int tuitionBalance = 0;
	private static int courseCost = 600;
	private static int ID = 1000;
	
	
	// Constructor: Prompt user to to enter students name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name of student: ");
		this.firstName = scanner.nextLine();
		
		System.out.println("Enter last name of student: ");
		this.lastName = scanner.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter grade level: ");
		this.gradeLevel = scanner.nextInt();
		while (gradeLevel < 1 || gradeLevel > 4) {
			System.out.println("Please enter a valid number (1 - 4)");
			gradeLevel = scanner.nextInt();
			}
		switch (gradeLevel) {
		case 1:
			gradeName = "Freshman";
			break;
		case 2:
			gradeName = "Sophomore";
			break;
		case 3:
			gradeName = "Junior";
			break;
		case 4:
			gradeName = "Senior";
			break;
		default:
			break;
		}
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeName + " " + studentID);
		
	
		
	}

	
	// Generate a 5 digit ID (Grade Level is first number)
	private void setStudentID() {
		ID++;
		this.studentID = gradeLevel + "" + ID;
		
	}
	
	// Enroll in courses
	public void enrollCourses() {
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner scanner = new Scanner(System.in);
		String course = scanner.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += courseCost;
			}
			else {
			break;
			}
		} while (1 != 0);
		System.out.println("ENROLLED IN: " + courses);
		
		
		
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("TUITION BALANCE: $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		System.out.println("Enter your payment for tuition: $");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Display information of Student
	public void ShowInfo() {
		System.out.println("\nName: " + firstName + " " + lastName + "\nStudent ID: " + studentID + "\nGrade: " + gradeName + "\nCourses Enrolled: " + courses);
		System.out.println("Balance: $" + tuitionBalance);
	}


}