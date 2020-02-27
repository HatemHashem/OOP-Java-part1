
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius=reader.nextInt();
        System.out.println("Circumference of the circle: "+((double)2*Math.PI*radius));


        // Program your solution here 
    }
}
