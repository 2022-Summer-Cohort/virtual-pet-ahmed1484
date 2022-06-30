package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void FeedAllShouldFeedAllPets() {
        VirtualPetShelter undertest = new VirtualPetShelter();
        undertest.feedAll();
        assertEquals(2, undertest.findByPetName("ahmed").getHungerLevel());
    }


    @Test
    public void WaterAllShouldWaterAllPets() {
        VirtualPetShelter undertest = new VirtualPetShelter();
        undertest.waterAll();
        assertEquals(-2, undertest.findByPetName("ahmed").getThirstLevel());
    }

    @Test
    public void PlayAllShouldPlayWithAllPets() {
        VirtualPetShelter undertest = new VirtualPetShelter();
        undertest.playAll();
        assertEquals(3, undertest.findByPetName("ahmed").getBoredomLevel());
    }
}






