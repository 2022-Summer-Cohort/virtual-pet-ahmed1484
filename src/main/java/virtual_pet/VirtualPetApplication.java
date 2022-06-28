package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    private static VirtualPet John;

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet Ahmed = new RoboticCat( " Ahmed", 9,9, 9, 9,9);
        VirtualPetShelter shelter1 = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        String userChoice = "";
        while (!userChoice.equalsIgnoreCase("quit"))
        {
            shelter1.showStatuses();
            System.out.println("hit selection:feed| play| water| quit| walk| cleanCage| cleanLitterBox| oil| maintain| admit| adopt|");
            userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    shelter1.feedAll();
                    break;
                case "water":
                    shelter1.waterAll();
                    break;
                case "play":
                    shelter1.playAll();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                case "walk":
                    shelter1.walk();
                    break;
                case "cleancage":
                    shelter1.CleanCage();
                    break;
                case "cleanlitterbox":
                    shelter1.CleanLitterBox();
                    break;
                case "oil":
                    shelter1.oilRobots();
                    break;
                case "admit":
                    System.out.println("what is your pet's name?");
                    String name = input.nextLine();
                    System.out.println("is your pet organic or robotic");
                    String type = input.nextLine();
                    System.out.println(" is pet a dog or a cat");
                    String catOrDog = input.nextLine();
                    VirtualPet temp;
                    if ( type.equalsIgnoreCase("robotic")&& catOrDog.equalsIgnoreCase("dog")){
                        temp = new RoboticDog(name, 7,5,8,8,3 );
                        shelter1.admitPet(temp);
                    }
                    if ( type.equalsIgnoreCase("robotic")&& catOrDog.equalsIgnoreCase("cat")){
                        temp = new RoboticCat(name, 7,5,8,8,3 );
                        shelter1.admitPet(temp);
                    }
                    if ( type.equalsIgnoreCase("organic")&& catOrDog.equalsIgnoreCase("dog")){
                        temp = new OrganicDog(name, 7,5,8,8);
                        shelter1.admitPet(temp);
                    }
                    if ( type.equalsIgnoreCase("organic")&& catOrDog.equalsIgnoreCase("cat")){
                        temp = new OrganicCat(name, 7,5,8,8);
                        shelter1.admitPet(temp);
                    }
                case "maintain":
                    shelter1.maintainRobot();
                    break;
                case "adopt":
                    System.out.println("whats the name of the pet you wanna adopt");
                    String petName = input.nextLine();
                    shelter1.adopt(petName);
                    break;

            }
            shelter1.tickAll();
        }
    }
}

