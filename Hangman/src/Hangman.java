import java.util.Random;
import java.util.Scanner;

public class Hangman {
	 // Words that the computer can choose from for hangman
    public static final String[] words = {
            "banana", "computer", "watermelon", "philosophical",
            "chimpanzee", "notebook", "gummy", "basketball"};

    // random object to get the computer to choose a random word
    Random random = new Random();
    
    final int mistakesAllowed = 7;
    int numMistakes = 0;
    // Get the computer to choose a random word in the array of words given
    String chosenWord = words[random.nextInt(words.length)];

    // Method to print out _ to start game
    public void startGame() {
        for (int i = 0; i < chosenWord.length(); i++) {
            System.out.print("_ ");
        }
    }

    public void playGame() {
        Scanner input = new Scanner(System.in);
        String guess;
        String str = "";
        int index;
        boolean win = true;
        for (int i = 0; i < chosenWord.length(); i++) {
        	// add the random number of _ 's to str
            str = str + "_ ";
        }
        // Keep guessing until you run out of tries
        while (numMistakes < mistakesAllowed) {
            System.out.println("\n \nEnter a letter to guess: ");
            guess = input.nextLine();
            index = chosenWord.indexOf(guess);

            if (index == 0 && guess.length() > 1) {
                break;
            }
            if (index == -1) {
                numMistakes++;
                System.out.println("You have " + (mistakesAllowed - numMistakes) + " tries left.");
            }
            else {
                while (index >= 0) {
                    str = str.substring(0, index * 2) + guess + str.substring(index * 2 + 1);
                    index = chosenWord.indexOf(guess, index + 1);
                }
            }
            System.out.println(str);
        }
        // When you use up all your guesses
        if (numMistakes == mistakesAllowed) {
            System.out.println("You lose.");
        }
        else {
            System.out.println("You win.");
        }

    }

	public static void main(String[] args) {
		    Hangman hang = new Hangman();
		    hang.startGame();
		    hang.playGame();
		}

	}


