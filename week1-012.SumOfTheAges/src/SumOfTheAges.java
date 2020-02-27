
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstUserName=reader.nextLine();
        System.out.print("Type your age: ");
        int firstUserAge=reader.nextInt();
        //
        System.out.print("Type your name: ");
        reader.nextLine();
        String secoundUserName=reader.nextLine();
        System.out.print("Type your age: ");
        int secoundUserAge=reader.nextInt();
        System.out.println(firstUserName+" and "+secoundUserName+" are "+(firstUserAge+secoundUserAge)+" years old in total.");

        // Implement your program here
    }
}
