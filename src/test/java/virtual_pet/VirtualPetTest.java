
package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    private VirtualPet underTest = new VirtualPet("John ", 10, 10, 10);

    @Test
    public void hungerLevelShouldIncrease() {
        assertEquals(10, underTest.getHungerLevel());
        underTest.feed();
        assertEquals(6, underTest.getHungerLevel());
        underTest.feed();
        assertEquals(2, underTest.getHungerLevel());
        underTest.feed();

    }
    @Test
    public void thirstLevelShouldIncrease(){
        assertEquals(10, underTest.getThirstLevel());
        underTest.water();
        assertEquals(7, underTest.getThirstLevel());
        underTest.water();
        assertEquals(4, underTest.getThirstLevel());
        underTest.water();
    }
    @Test
    public void boredomLevelShouldDecrease() {
        assertEquals(10, underTest.getBoredomLevel());
        underTest.play();
        assertEquals(8, underTest.getBoredomLevel());
        underTest.play();
        assertEquals(6, underTest.getBoredomLevel());
        underTest.play();


    }
    @Test
    public void tick(){
        assertEquals(10, underTest.getBoredomLevel());
        underTest.tick();
        assertEquals(11, underTest.getThirstLevel());
        underTest.tick();
        assertEquals(12, underTest.getHungerLevel());
        underTest.tick();

    }


}
