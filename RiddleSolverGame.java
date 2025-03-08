import java.util.Scanner;

public class RiddleSolverGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            "The more of this there is, the less you see. What is it?",
            "What has keys but can’t open locks?",
            "What has a heart that doesn’t beat?"
        };
        String[] answers = {
            "echo",
            "darkness",
            "piano",
            "artichoke"
        };
        int maxTries = 3; // Number of incorrect attempts before the game ends.
        int currentLevel = 0;
        boolean isGameOver = false;
        
        System.out.println("Welcome to the Riddle Solver Game!");
        System.out.println("Try to answer the riddles correctly to move to the next level.");
        
        while (currentLevel < riddles.length && !isGameOver) {
            System.out.println("\nRiddle " + (currentLevel + 1) + ":");
            System.out.println(riddles[currentLevel]);
            int tries = 0;
            boolean answeredCorrectly = false;
            
            // Allow the player a few tries to answer each riddle
            while (tries < maxTries && !answeredCorrectly) {
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine().toLowerCase();
                tries++;
                
                if (userAnswer.equals(answers[currentLevel])) {
                    System.out.println("Correct! Moving on to the next riddle.");
                    answeredCorrectly = true;
                    currentLevel++;
                } else {
                    if (tries < maxTries) {
                        System.out.println("Wrong answer. Try again!");
                    } else {
                        System.out.println("Sorry, you've run out of attempts! Game Over.");
                        isGameOver = true;
                    }
                }
            }
        }

        if (!isGameOver) {
            System.out.println("\nCongratulations! You've solved all the riddles!");
        }
        
        scanner.close();
    }
}
