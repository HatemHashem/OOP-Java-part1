
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerLimit=Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int higherLimit=Integer.parseInt(reader.nextLine());
        while (lowerLimit<=higherLimit){
            System.out.println(lowerLimit++);
        }

        // write your code here

    }
}
