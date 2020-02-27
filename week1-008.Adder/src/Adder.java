import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secoundNumber = reader.nextInt();
        System.out.println("Sum of the numbers: "+(firstNumber+secoundNumber));

        // Implement your program here. Remember to ask the input from user
    }
}
