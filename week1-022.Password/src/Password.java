
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        boolean correctPassword=false;
        while (!correctPassword){
            System.out.print("Type the password: ");
            String userPassowrd=reader.nextLine();
            if(userPassowrd.equals(password)){
                correctPassword=true;
                System.out.println("Right!");
                System.out.println("The secret is:"+"basa is the killer");
            }else {
                System.out.println("Wrong!");
            }
        }
        // Write your code here
    }
}
