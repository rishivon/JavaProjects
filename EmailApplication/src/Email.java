import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String company;
	private String email;
	private int mailCapacity = 500;
	private int defaultPasswordLength = 10;
	private String altEmail;
	private String companyName = "thecompany.com";
	
	// Constructor to receive first and last name
	Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + firstName + " " + lastName);
		
		// Call method asking for department to return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call method that returns random password
		this.password = randPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
		System.out.println("Your email is " + email);
		
	}
	// Method to ask for the department and return
	private String setDepartment() {
		System.out.println("Choose department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner scanner = new Scanner(System.in);
		int depChoice = scanner.nextInt();
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "development";
		}
		else if (depChoice == 3) {
			return "accounting";
		}
		else {
			return " ";
		}
	}
	// Generate random password
	private String randPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mailbox capacity (if you want to change capacity)
	public void setMailCapacity(int space) {
		this.mailCapacity = space;
	}
	
	//Set alternate email (if you want to add email)
	public void setAltEmail(String AlternateEmail) {
		this.altEmail = AlternateEmail;
	}
	
	
	// Change password (if you want to make your own)
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Getter methods
	public int getMailCapacity() {
		return mailCapacity;
	}
	
	public String getAltEmail() {
		return altEmail;
	}
	
	public String getNewPassword() {
		return password;
	}
	
}
	

