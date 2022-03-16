import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class virtualPetTest {
    VirtualPet underTest = new VirtualPet("name", 50, 50, 50, true);
    VirtualPet pet1 = new VirtualPet("name2", 0, 50, 50, true);

    @Test
    public void whatIsYourPetsName() {
        String name = underTest.getName();
        String name2 = pet1.getName();
        assertEquals("name", name);
        assertEquals("name2", name2);
    }

    @Test
    public void whatIsYourPetsHealth() {
        int health = underTest.getHealth();
        int health1 = pet1.getHealth();
        assertEquals(50, health);
        assertEquals(50, health1);

    }

    @Test
    public void whatIsYourPetsHunger() {
        int hunger = underTest.getHunger();
        int hunger1 = pet1.getHunger();
        assertEquals(50, hunger);
        assertEquals(50, hunger1);
    }

    @Test
    public void whatIsYourPetsThirst() {
        int thirst = underTest.getThirst();
        int thirst1 = pet1.getThirst();
        assertEquals(50, thirst);
        assertEquals(50, thirst1);

    }

    @Test
    public void feedingYourPetOnePortionWillDecreaseHungerBy10() {
        underTest.feed(2);
        int hunger = underTest.getHunger();
        assertEquals(30, hunger);
        pet1.feed(1);
        int hunger1 = pet1.getHunger();
        assertEquals(40, hunger1);

    }

    @Test
    public void wateringYourPetOnePortionWillDecreaseThirstBy25() {
        underTest.water(1);
        int thirst = underTest.getThirst();
        assertEquals(25, thirst);
        pet1.water(2);
        int thirst1 = pet1.getThirst();
        assertEquals(0, thirst1);

    }
    @Test
    public void playingWithYourPetWillIncreaseHealthBy10(){
        underTest.play(1);
        int health = underTest.getHealth();
        assertEquals(60, health);
        pet1.play(2);
        int health1 = pet1.getHealth();
        assertEquals(70, health1);
    }
    @Test
    public void healthWillNotIncreaseAbove100(){
    underTest.play(15);
    int health = underTest.getHealth();
    assertEquals(100, health);
    pet1.play(4);
    int health1 = pet1.getHealth();
    assertEquals(90, health1);

    }
    @Test
    public void ifYourPetsHealthIs0YourPetIsNoLongerAlive(){
        boolean aliveStatus = underTest.getAlive();
        assertEquals(true, aliveStatus);
        boolean aliveStatus1 = pet1.getAlive();
        assertEquals(false, aliveStatus1);

    }



}
