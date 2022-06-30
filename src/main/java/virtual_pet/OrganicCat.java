package virtual_pet;

public class OrganicCat extends OrganicPet {
    public OrganicCat ( String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);
    }
    @Override
    public void showStatus() {
        System.out.println("organic Cat " +getName() + " hunger " +getHungerLevel() + " boredom " + getBoredomLevel() + " thirst " + getThirstLevel() + " my litterbox is " + cleanlinessLevel);
    }
}
