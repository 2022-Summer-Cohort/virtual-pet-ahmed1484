package virtual_pet;

public  class RoboticDog extends RoboticPet implements Walk {
    public RoboticDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, oilLevel, maintenanceLevel);
    }
    @Override
    public void walk() {
        maintenanceLevel ++;
        oilLevel --;
    }






    @Override
    public void showStatus() {
        System.out.println("robotic dog " + getName() + " hunger "+ getHungerLevel() + " boredom "+getBoredomLevel() + " thirst " + getThirstLevel() + " maintenance " + getMaintenanceLevel() + " oil " + getOilLevel());
    }


    }

