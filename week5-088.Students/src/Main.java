import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<Student>();
        while (true){
            System.out.print("name: ");
            String name=reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber=reader.nextLine();
            list.add(new Student(name,studentNumber));

        }
        for(Student stu :list){
            System.out.println(stu);
        }
        System.out.print("Give search term: ");
        String searchingItem=reader.nextLine();
        System.out.println("Result:");
       for(Student stu:list){
           if(stu.getName().contains(searchingItem)){
               System.out.println(stu);
           }
       }

    }
}
