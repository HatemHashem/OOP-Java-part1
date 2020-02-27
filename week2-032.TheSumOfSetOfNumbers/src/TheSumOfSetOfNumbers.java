
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        int count=1;
        System.out.print("Until what? ");
        int upperLimit=Integer.parseInt(reader.nextLine());
        while(count<=upperLimit){
            sum+=count;
            count++;
        }
        System.out.println("Sum is "+sum);

    }
}
