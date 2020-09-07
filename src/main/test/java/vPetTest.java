import org.junit.Test;

import java.time.Clock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class vPetTest {

    @Test
    public void petShouldHaveHungerOf4() {
        Pet underTest = new Pet(4, 4, 4, 4);
        int hunger = underTest.getHunger();
        assertThat(hunger, is(4));
    }

    @Test
    public void petShouldHaveThirstOf4() {
        Pet underTest = new Pet(4, 4, 4, 4);
        int thirst = underTest.getThirst();
        assertThat(thirst, is(4));
    }

    @Test
    public void petShouldHaveBoredomOf4() {
        Pet underTest = new Pet(4, 4, 4, 4);
        int boredom = underTest.getBoredom();
        assertThat(boredom, is(4));
    }

    @Test
    public void petShouldHaveSmellOf4() {
        Pet underTest = new Pet(4, 4, 4, 4);
        int Smell = underTest.getSmell();
        assertThat(Smell, is(4));
    }

    @Test
    public void feedingPetShouldDecreaseHunger() {
        Pet underTest = new Pet(4, 4, 4, 4);
        underTest.feed(2,4,6);
        int hunger = underTest.getHunger();
        assertEquals(hunger, 12);
    }

    @Test
    public void givingWaterPetShouldDecreaseThirst() {
        Pet underTest = new Pet(4, 4, 4, 4);
        underTest.giveWater(4, 6, 8);
        int thirst = underTest.getThirst();
        assertEquals(thirst, 12);
    }
    @Test
    public void givingPlayingWithPetShouldDecreaseBoredom() {
        Pet underTest = new Pet(4, 4, 4, 4);
        underTest.playWith(5);
        int boredom = underTest.getBoredom();
        assertEquals(boredom, 12);
    }
    @Test
    public void cleaningPetShouldDecreaseSmell() {
        Pet underTest = new Pet(4, 4, 4, 4);
        underTest.clean(4,8);
        int smell = underTest.getSmell();
        assertEquals(smell, 12);
    }
    @Test
    public void tickShouldIncreaseAllVariables() {
        Pet underTest = new Pet(4, 4, 4, 4);
        underTest.tick();
        int hunger = underTest.getHunger();
        int thirst = underTest.getThirst();
        int boredom = underTest.getBoredom();
        int smell = underTest.getSmell();
        assertEquals(hunger, 4);
        assertEquals(thirst, 4);
        assertEquals(boredom, 4);
        assertEquals(smell,4);
    }

}

