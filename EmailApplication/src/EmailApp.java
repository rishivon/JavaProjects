import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		
		System.out.println("Enter first name: ");
		Scanner scanner = new Scanner(System.in);
		firstName = scanner.nextLine();
		System.out.println("Enter last name: ");
		Scanner scanner2 = new Scanner(System.in);
		lastName = scanner.nextLine();
		
		Email obj1 = new Email(firstName, lastName);
		obj1.setAltEmail("rishivon@gmail.com");
		obj1.setMailCapacity(600);
		obj1.changePassword("qwerty123");
		
		System.out.println(obj1.getAltEmail());
		System.out.println(obj1.getMailCapacity());
		System.out.println(obj1.getNewPassword());
		
	}

}
