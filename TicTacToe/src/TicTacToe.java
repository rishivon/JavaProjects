import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		// create empty game board
		char [][] gameBoard = {{' ', '|',' ', '|', ' '}, 
							   {'-', '+','-', '+', '-'},
							   {' ', '|',' ', '|', ' '},
							   {'-', '+','-', '+', '-'},
							   {' ', '|',' ', '|', ' '}};
		printGameBoard(gameBoard);
	
		while (true) {
			System.out.println("Enter placement (1-9): ");
			Scanner scan = new Scanner(System.in);
			int playerPos = scan.nextInt();
			while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos) ) {
				System.out.println("Position taken! Please enter a new position.");
				playerPos = scan.nextInt();
			}
			System.out.println(playerPos);
	
			placePiece(gameBoard, playerPos, "player");
			String result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos) ) {
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(gameBoard, cpuPos, "CPU");
			printGameBoard(gameBoard);
			
			result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				printGameBoard(gameBoard);
				break;
			}
		}
		
	}
	
	public static void printGameBoard(char[][] gameBoard) {
		for (int i = 0; i < gameBoard.length; i++) {  // cycles through every row
			for (int x = 0; x < gameBoard[i].length; x++) { // cycles through every element in each row
				System.out.print(gameBoard[i][x]);
			}
			System.out.println(); // New line after each row
		}
	}
	public static void placePiece(char[][] gameBoard, int position, String user) {
		
		char symbol = 'X';
		if (user.equals("player")) {
			symbol = 'X';
			playerPositions.add(position);
		}
		else if (user.equals("CPU")) {
			symbol = 'O';
			cpuPositions.add(position);
		}
		
		// X or O put in depending on what position you choose and CPU randomly chooses
		switch (position) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
				
		}
	}
	public static String checkWinner() {
		// Conditions for winning
		List topRow = Arrays.asList(1, 2, 3);
		List middleRow = Arrays.asList(4, 5, 6);
		List bottomRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List middleCol = Arrays.asList(2, 6, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(3, 5, 7);
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(middleRow);
		winning.add(bottomRow);
		winning.add(leftCol);
		winning.add(middleCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		// Checks if user wins, CPU wins, or Tie
		for(List l : winning) {
			if(playerPositions.containsAll(l)) {
				return "You have won the game!!";
			}
			else if (cpuPositions.containsAll(l)) {
				return "You have lost the game";
			}
			else if ((playerPositions.size() + cpuPositions.size() == 9) && 
					(!playerPositions.containsAll(l) || !cpuPositions.containsAll(l))) {
				return "TIE";
			}
		}
		return "";
	}
}



