
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int maxNumb=Integer.parseInt(reader.nextLine());
        int count=1;
        while(count<=maxNumb){
            System.out.println(count++);
        }

        
        // Write your code here
        
    }
}
