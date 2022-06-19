package virtual_pet;

public  class RoboticDog extends RoboticPet implements Walking {
    public RoboticDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void walk() {

    }

    @Override
    public void walking() {

    }
}
