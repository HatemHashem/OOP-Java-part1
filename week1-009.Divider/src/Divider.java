
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber=Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secoundNumber=reader.nextInt();
        System.out.println("Division: "+firstNumber+" / "+secoundNumber+" = "+" "+((double)firstNumber/secoundNumber));

        // Implement your program here. Remember to ask the input from user.
    }
}
