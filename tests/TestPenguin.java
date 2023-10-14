import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestPenguin {

    Penguin penguin;

    @Before
    public void setup() throws Exception {
        penguin = new Penguin(true, 15, false, true, "Pingu", 12, 9,
                "v formal", new HashSet<>(){{
                    add("diamond beak-ring");
        }}, "none to orcas");
    }

    @Test
    public void testGetMarching() {
        Assert.assertTrue(penguin.getMarching());
    }

    @Test
    public void testGetWingspan() {
        Assert.assertEquals(15, penguin.getWingspan());
    }

    @Test
    public void testGetCanFly() {
        Assert.assertFalse(penguin.getCanFly());
    }

    @Test
    public void testGetCanSwim() {
        Assert.assertTrue(penguin.getCanSwim());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Pingu", penguin.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(12, penguin.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(9, penguin.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("v formal", penguin.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("diamond beak-ring");
        }}, penguin.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("none to orcas", penguin.getThreatLevel());
    }

    @Test
    public void testSetMarching() {
        penguin.setMarching(false);
        Assert.assertFalse(penguin.getMarching());
    }
}
