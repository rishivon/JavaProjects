import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AirlineRes {

	public static void main(String[] args) {
		
		double ticketPrice = 0;
		
		// prompt user input
		System.out.println("Enter your first and last name: ");
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();
		System.out.println(fullName);
		
		System.out.println("Enter the date of flying(dd-mm-yyyy): ");
		String date = scanner.nextLine();
		System.out.println(date);
		
		System.out.println("Enter the destination: ");
		String destination = scanner.nextLine();
		System.out.println(destination);
		
		// prompt user to input a character: Either F or S
		System.out.println("Type F for a first class ticket and type S for a second class ticket");
		char classTicket = scanner.next().charAt(0);
		if (classTicket == 'F' || classTicket == 'f') {
			System.out.println("You have selected a first class ticket. ");
		}
		else if (classTicket == 'S' || classTicket == 's') {
			System.out.println("You have selected a second class ticket. ");
		}
		
		// User input a number: either 1 or 2
		System.out.println("Type 1 for a one way ticket and type 2 for a round trip ticket");
		int typeTicket = scanner.nextInt();
		if (typeTicket == 1) {
			System.out.println("You have selected a one way ticket. ");
			if (classTicket == 'F' || classTicket == 'f') {
				ticketPrice = 190.42;
			}
			else if (classTicket == 'S' || classTicket == 's') {
				ticketPrice = 100.42;
			}
		}
		else if (typeTicket == 2) {
			System.out.println("You have selected a round trip ticket. ");
			if (classTicket == 'F' || classTicket == 'f') {
				ticketPrice = 190.42 * 2;
			}
			else if (classTicket == 'S' || classTicket == 's') {
					ticketPrice = 100.42 * 2;
				}
			}
		
		System.out.println("Type true if you are bringing a pet and false if not.");
		Boolean bringPet = scanner.nextBoolean();
		if (bringPet = true) {
			System.out.println("Enter number of pets you are bringing: ");
			int numPets = scanner.nextInt();
			ticketPrice += numPets * 90.00;
			DecimalFormat df = new DecimalFormat("#.##");
	        df.setRoundingMode(RoundingMode.CEILING); // round up
			System.out.println("Ticket Price: $" + df.format(ticketPrice));
		
		}
			
		
		
		
		
		
		
		
		
	}

}
