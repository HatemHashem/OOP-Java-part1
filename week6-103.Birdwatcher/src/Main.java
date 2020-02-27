import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner input=new Scanner(System.in);
        BirdWatcher birdWatcher=new BirdWatcher();
        System.out.print("?");
        String userCommand=input.nextLine();
        while (!userCommand.equalsIgnoreCase("quit")){
            if(userCommand.equalsIgnoreCase("Add")){
                System.out.print("Name: ");
                String name=input.nextLine();
                System.out.print("Latin Name: ");
                String latinName=input.nextLine();
                birdWatcher.add(new Birds(name,latinName));
                System.out.print("?");
                userCommand=input.nextLine();
            }else if(userCommand.equalsIgnoreCase("Observation")){
                System.out.print("What was observed:? ");
                String observedBird=input.nextLine();
                birdWatcher.observation(observedBird);
                System.out.print("?");
                userCommand=input.nextLine();
            }else if(userCommand.equalsIgnoreCase("Statistics")){
                birdWatcher.statistics();
                System.out.print("?");
                userCommand=input.nextLine();
            }else if (userCommand.equalsIgnoreCase("Show")){
                System.out.print("What? ");
                String birdToShow=input.nextLine();
                birdWatcher.show(birdToShow);
                System.out.print("?");
                userCommand=input.nextLine();

            }else {
                System.out.println("wrong command");
                System.out.print("?");
                userCommand=input.nextLine();

            }
        }

    }


}
