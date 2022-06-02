package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    private static VirtualPet John;

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet john = new VirtualPet("Journey", 6, 6, 6);
        Scanner input = new Scanner(System.in);
        while (John.isAlive()) ;
        {
            john.showStatus();
            System.out.println("hit selection:feed| play| water| quit");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    john.feed();
                    break;
                case "water":
                    john.watered();
                    break;
                case "play":
                    john.played();
                    break;
            }
        }
    }
}
