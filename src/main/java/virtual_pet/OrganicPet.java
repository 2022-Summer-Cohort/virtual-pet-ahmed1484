package virtual_pet;

public class OrganicPet extends VirtualPet {
    protected int cleanlinessLevel;

    public OrganicPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int cleanlinessLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void cleanCage() {
        cleanlinessLevel -= 5;
    }

    public void CleanLitterBox() {
        cleanlinessLevel = 0;

    }
}
