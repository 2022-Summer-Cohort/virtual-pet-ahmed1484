package virtual_pet;

public class OrganicDog extends OrganicPet implements Walk{

    public OrganicDog(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);

    }
    @Override
    public void walk(){
        int boredomLevel = 0;
        boredomLevel--;
        cleanlinessLevel++;
    }





    @Override
    public void showStatus() {
        System.out.println("organicDog " + getName() + " hunger "+ getHungerLevel() + " boredom "+getBoredomLevel() + " thirst " + getThirstLevel() + " cleanliness " + getCleanlinessLevel());
    }



    }


