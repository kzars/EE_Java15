package classTasks;


import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guess;


        System.out.println("Enter max random range");
        int max = scanner.nextInt();

        System.out.println("How many tries?");
        int guessCount = scanner.nextInt();

        int rand = (int) (Math.random() * (max)) + 1;

        System.out.println("Guess the number");
        guess = scanner.nextInt();
        guessCount--;
        while (guess != rand && guessCount > 0){
            System.out.println("You have left " + guessCount + " tries");
            if(guess > rand){
                System.out.println("Try smaller");
            } else {
                System.out.println("Try bigger");
            }
            guess = scanner.nextInt();
            guessCount--;
        }

        if(guess == rand){
            System.out.println("Congratulations you won!");
        } else {
            System.out.println("Sorry you lost");
            System.out.println("Random number was " + rand);
        }


    }
}
