import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name=reader.nextLine();
        System.out.println("In reverse order: "+reverseString(name));

    }
    public static String reverseString(String text){
        String reversedString="";
        int i=text.length()-1;
        while (i>=0){
            reversedString+=text.charAt(i);
            i--;
        }
        return reversedString;
    }
}
