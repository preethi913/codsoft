 import java.util.Random;
    import java.util.Scanner;
    
    public class NumberGuessingGame {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalRounds = 0;
            int totalWins = 0;
    
            // Step 6: Option for multiple rounds
            while (true) {
                totalRounds++;
                System.out.println("Round " + totalRounds);
                boolean result = playRound(scanner);
    
                if (result) {
                    totalWins++;
                }
    
                // Step 7: Display score after each round
                System.out.println("Total rounds: " + totalRounds + ", Total wins: " + totalWins);
    
                // Ask if the user wants to play another round
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next();
    
                if (playAgain.equalsIgnoreCase("no")) {
                    break;
                }
            }
            scanner.close();
            System.out.println("Thanks for playing! Final score: " + totalWins + " wins out of " + totalRounds + " rounds.");
        }
    
        // Step 1-5: Play a round of the game
        public static boolean playRound(Scanner scanner) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean guessedCorrectly = false;
    
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");
            
            // Step 2: Prompt the user to guess the number
            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.print("You have " + attemptsLeft + " attempts left. Enter your guess: ");
                int guess = scanner.nextInt();
    
                // Step 3: Compare the guess with the generated number
                if (guess == numberToGuess) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number correctly!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attemptsLeft--;
            }
    
            // If the user did not guess correctly within 10 attempts
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts! The number was " + numberToGuess + ".");
            }
    
            return guessedCorrectly;
        }
    }


output:

Round 1
I have generated a number between 1 and 100. Try to guess it!
You have 10 attempts left. Enter your guess: 70
Too high! Try again.
You have 9 attempts left. Enter your guess: 50
Too high! Try again.
You have 8 attempts left. Enter your guess: 25
Too high! Try again.
You have 7 attempts left. Enter your guess: 15
Too low! Try again.
You have 6 attempts left. Enter your guess: 20
Too high! Try again.
You have 5 attempts left. Enter your guess: 17
Too high! Try again.
You have 4 attempts left. Enter your guess: 16
Congratulations! You guessed the number correctly!
Total rounds: 1, Total wins: 1
Do you want to play again? (yes/no): yes
Round 2
I have generated a number between 1 and 100. Try to guess it!
You have 10 attempts left. Enter your guess: 45
Too low! Try again.
You have 9 attempts left. Enter your guess: 75
Too high! Try again.
You have 8 attempts left. Enter your guess: 65
Too high! Try again.
You have 7 attempts left. Enter your guess: 55
Too high! Try again.
You have 6 attempts left. Enter your guess: 45
Too low! Try again.
You have 5 attempts left. Enter your guess: 50
Too high! Try again.
You have 4 attempts left. Enter your guess: 48
Too high! Try again.
You have 3 attempts left. Enter your guess: 46
Too low! Try again.
You have 2 attempts left. Enter your guess: 47
Congratulations! You guessed the number correctly!
Total rounds: 2, Total wins: 2
Do you want to play again? (yes/no): no
Thanks for playing! Final score: 2 wins out of 2 rounds.



    

