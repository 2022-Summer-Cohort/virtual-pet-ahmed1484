package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog("Ahmed", 6, 1, 5,10,10));
        shelter.add(new RoboticCat("zack", 4, 2, 3,10,10));
        shelter.add(new OrganicDog("mike", 7, 5, 2,10));
        shelter.add(new OrganicCat("moe", 7, 5, 2,10));

    }

    public void admitPet(VirtualPet pet) {
        shelter.add(pet);

    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }





    public void showStatuses() {
        for (VirtualPet pet : shelter) {
            pet.showStatus();
        }

    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.water();
        }
    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.play();
        }
    }

    public void adopt(String name) {
        shelter.remove(findByPetName(name));

    }


    public VirtualPet findByPetName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;


            }


        }
        return null;

    }
    public void tickAll() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public void walk() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walk) {
                ((Walk) pet).walk();
            }


        }

    }

    public void oilRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilRobots();
            }
        }


    }

    public void maintainRobot() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).maintainRobots();
            }
        }
    }

    public void CleanCage () {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }

        }
    }

    public void CleanLitterBox () {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).CleanLitterBox();
            }

        }
    }
}
