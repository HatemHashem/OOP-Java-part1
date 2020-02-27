import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        int sum=0;
        while (lowerLimit<=upperLimit) {
            sum+=lowerLimit;
            lowerLimit++;
        }
        System.out.println("The sum is "+sum);

    }
}
