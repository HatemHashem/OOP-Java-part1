
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ype the points [0-60]: ");
        int studentGrade=Integer.parseInt(reader.nextLine());
        if(studentGrade>=50&&studentGrade<=60){
            System.out.println("Grade: 5");
        }else if(studentGrade>=45&&studentGrade<=49){
            System.out.println("Grade: 4");

        }else if(studentGrade>=40&&studentGrade<=44){
            System.out.println("Grade: 3");
        }else if(studentGrade>=35&&studentGrade<=39){
            System.out.println("Grade: 2");
        }else if(studentGrade>=30&&studentGrade<=34){
            System.out.println("Grade: 1");
        }else {
            System.out.println("Grade: failed");
        }

    }
}
