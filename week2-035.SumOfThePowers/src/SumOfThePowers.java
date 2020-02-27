import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int maxPOwerBase2 = Integer.parseInt(reader.nextLine());
        int count = 0;
        int sum = 0;

        while (count <= maxPOwerBase2) {
            sum+=Math.pow(2, count);
            count++;

        }
        System.out.println("The result is "+sum);


    }
}
