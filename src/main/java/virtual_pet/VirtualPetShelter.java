package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("Ahmed", 6, 1, 5));
        shelter.add(new VirtualPet("zack", 4, 2, 3));
        shelter.add(new VirtualPet("mike", 7, 5, 2));

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
}