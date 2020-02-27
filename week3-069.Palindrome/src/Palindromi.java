import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
       boolean isPalindrome=true;
        for(int i=0,j=text.length()-1;i<text.length()&&j>=0;i++,j--){
            if(text.charAt(i)==text.charAt(j)){
                continue;

            }else {
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
