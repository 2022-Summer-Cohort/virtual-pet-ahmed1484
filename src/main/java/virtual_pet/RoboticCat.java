package virtual_pet;

public class RoboticCat extends RoboticPet{
    public RoboticCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oil, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, oil, maintenanceLevel);
    }


    @Override
    public void showStatus() {
        System.out.println("robtic cat " + getName() + " hunger "+ getHungerLevel() + " boredom "+getBoredomLevel() + " thirst " + getThirstLevel() + " maintenance " + getMaintenanceLevel() + " oil " + getOilLevel());
    }
}
