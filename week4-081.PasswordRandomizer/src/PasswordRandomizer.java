import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
   private int length;
    private Random randomNumber=new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        int count=0;
        String randomPass="";
        while (count<this.length){
            randomPass+=alphabet.charAt(this.randomNumber.nextInt(alphabet.length()-1));
            count++;
        }
        return randomPass;
    }
}
