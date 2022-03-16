import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApp {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to virtual pet!");
        System.out.println("Please name your pet.");
        String userEnteredName = input.nextLine();

        VirtualPet myVirtualPet = new VirtualPet(userEnteredName, 50, 50, 50, true);
        System.out.println("How would you like to interact with " + userEnteredName + "?");
        System.out.println("Press 1 to Feed " + userEnteredName);
        System.out.println("Press 2 to play with " + userEnteredName);
        System.out.println("Press 3 to water " + userEnteredName);
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while (myVirtualPet.getAlive() && !userChoice.equals("4")) {


            if (userChoice.equals("1")) {
                System.out.println("How many portions would you like to feed " + userEnteredName + "?");
                int foodPortion = input.nextInt();
                input.nextLine();
                myVirtualPet.feed(foodPortion);
            } else if (userChoice.equals("2")) {
                System.out.println("How many minutes will you play with " + userEnteredName + "?");
                int play = input.nextInt();
                input.nextLine();
                myVirtualPet.play(play);
            } else if (userChoice.equals("3")) {
                System.out.println("How many portions of water will you give " + userEnteredName + "?");
                int waterPortion = input.nextInt();
                input.nextLine();
                myVirtualPet.water(waterPortion);
            } else {
                System.out.println("Unknown request. Please try again.");
            }
            System.out.println("How would you like to interact with " + userEnteredName + "?");
            System.out.println("Press 1 to Feed " + userEnteredName);
            System.out.println("Press 2 to play with " + userEnteredName);
            System.out.println("Press 3 to water " + userEnteredName);
            System.out.println("Press 4 to exit");
            userChoice = input.nextLine();

            myVirtualPet.tick();

        }
        if (!myVirtualPet.getAlive()){
            System.out.println("Unfortunately " + userEnteredName + " has passed away. I'm sorry for your loss.");
        }
        if (userChoice.equals("4")){
            System.out.println("Thanks for playing!");
        }
    }
}
