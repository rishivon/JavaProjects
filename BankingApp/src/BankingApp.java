import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("Rishi", "rrv180001");
		obj1.showMenu();
	}
}

	class BankAccount {
		int balance;
		int prevTransaction;
		String customerName;
		String customerID;
		
		// Constructor of bank account
		BankAccount(String cName, String cID) {
			customerName = cName;
			customerID = cID;	
		}
		
		// Add the amount deposited to the balance and set value to previous transaction
		void deposit(int amount) {
				balance += amount;
				prevTransaction = amount;
		}
		// Subtract the amount deposited to the balance and set value to previous transaction
		void withdraw(int amount) {
			if (amount > balance) {
				System.out.println("Not enough money. Please enter a value within your range.");
			}
			else {
				balance -= amount;
				prevTransaction = -amount;
			}
		}
		
		// Outputs what your last transaction was
		void getPrevTransaction() {
			if (prevTransaction > 0) {
				System.out.println("You deposited " + prevTransaction + " dollars.");
			}
			else if (prevTransaction < 0){
				System.out.println("You withdrew " + Math.abs(prevTransaction) + " dollars.");
			}
			else {
				System.out.println("No transaction occured.");
			}
		}
		// Screen Display to choose what action to perform
		void showMenu() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome " + customerName);
			System.out.println("Your ID is " + customerID);
			System.out.println("A. Check balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Previous Transaction");
			System.out.println("E. Exit");
			do {
				
				System.out.println("Choose what action you would like to perform: ");
				option = scanner.next().charAt(0);
				switch(option) {
				case 'A':
					System.out.println("Your balance is " + balance);
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int depAmount = scanner.nextInt();
					deposit(depAmount);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int withAmount = scanner.nextInt();
					withdraw(withAmount);
					System.out.println("\n");
					break;
				case 'D':
					getPrevTransaction();
					System.out.println("\n");
					break;
				case 'E':
					break;
				default:
					System.out.println("Not a valid option. Please try again.");
			}
			
			} while (option!= 'E');
				System.out.println("Thank you for using our services.");
		}
	}

		
			
	

	

