
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        separatedCharacters(reader.nextLine());
    }
    public static void separatedCharacters(String text){
        int i=0;
        while(i<text.length()){
            System.out.println((i+1)+". character: "+text.charAt(i));
            i++;
        }
    }
}
