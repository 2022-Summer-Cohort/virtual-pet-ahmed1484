package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    private static VirtualPet John;

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet Ahmed = new RoboticCat( " Ahmed", 9,9, 9, 9,9);
        VirtualPetShelter dogs = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        String userChoice = "";
        while (!userChoice.equalsIgnoreCase("quit"))
        {
            dogs.showStatuses();
            System.out.println("hit selection:feed| play| water| quit");
            userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    dogs.feedAll();
                    break;
                case "water":
                    dogs.waterAll();
                    break;
                case "play":
                    dogs.playAll();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                case "walk":
                    OrganicDog shelter = null;
                    shelter.walk();
                    break;
                case "clean Cage":
                    shelter.CleanCage();
                    break;
                case "clean litter box":
                    shelter.CleanLitterBox();
                    break;
                case "oil robots":
                    shelter.oilRobots();
                    break;
                case "maintain robotic":
                    shelter.maintainRobot();
                    break;
            }
        }
    }
}

