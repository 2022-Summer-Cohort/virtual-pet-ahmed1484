package virtual_pet;
import java.util.ArrayList;
public abstract class RoboticPet extends VirtualPet {
    protected int oilLevel;
    protected int maintenanceLevel;


    public RoboticPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, thirstLevel, boredomLevel);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;


    }

    @Override
    public void tick() {
        super.tick();
        oilLevel--;
        maintenanceLevel--;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void maintainRobots() { maintenanceLevel =+ 10; }

    public void oilRobots() {
        oilLevel +=10;


}




}
