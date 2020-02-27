
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessCount=0;
        String guessCountMsg=", guesses made: ";

        // program your solution here. Do not touch the above lines!
       while (true){
           System.out.print("Guess a number:");
           int userGuessedNumber=Integer.parseInt(reader.nextLine());
           guessCount++;
           if(userGuessedNumber==numberDrawn){
               System.out.println("Congratulations, your guess is correct!");
               break;
           }else if(userGuessedNumber>numberDrawn){
               System.out.println("The number is lesser"+guessCountMsg+guessCount);
           }else if (userGuessedNumber<numberDrawn){
               System.out.println("The number is greater"+guessCountMsg+guessCount);
           }
       }

        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
