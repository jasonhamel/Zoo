import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestBird {
    Bird bird;

    @Before
    public void setup() throws Exception {
        bird = new Bird(56, true, false, "Pingu", 15, 10, "honky",
                new HashSet<>(){{add("long yellow beak");}}, "less than a tiger");
    }

    @Test
    public void testGetWingspan() {
        Assert.assertEquals(56, bird.getWingspan());
    }

    @Test
    public void testGetCanFly() {
        Assert.assertTrue(bird.getCanFly());
    }

    @Test
    public void testGetCanSwim() {
        Assert.assertFalse(bird.getCanSwim());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Pingu", bird.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(15, bird.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(10, bird.getCuteFactor());
    }

    @Test
    public void getPersonality() {
        Assert.assertEquals("honky", bird.getPersonality());
    }

    @Test
    public void getPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("long yellow beak");
        }}, bird.getPhysicalFeatures());
    }

    @Test
    public void getThreatLevel() {
        Assert.assertEquals("less than a tiger", bird.getThreatLevel());
    }

    @Test
    public void testSetWingspan() throws Exception {
        bird.setWingspan(1);
        Assert.assertEquals(1, bird.getWingspan());
    }

    @Test
    public void testSetCanFly() {
        bird.setCanFly(false);
        Assert.assertFalse(bird.getCanFly());
    }

    @Test
    public void testSetCanSwim() {
        bird.setCanSwim(true);
        Assert.assertTrue(bird.getCanSwim());
    }
}
