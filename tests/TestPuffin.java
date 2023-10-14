import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestPuffin {

    Puffin puffin;

    @Before
    public void setup() throws Exception {
        puffin = new Puffin(true, 30, true, true, "Puffy", 20, 10, "devoted",
                new HashSet<>(){{
                    add("lipstick marks on neck");
                }}, "0 to fam, 10 to foe");
    }

    @Test
    public void testGetMarried() {
        Assert.assertTrue(puffin.getMarried());
    }

    @Test
    public void testGetWingspan() {
        Assert.assertEquals(30, puffin.getWingspan());
    }

    @Test
    public void testGetCanFly() {
        Assert.assertTrue(puffin.getCanFly());
    }

    @Test
    public void testGetCanSwim() {
        Assert.assertTrue(puffin.getCanSwim());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Puffy", puffin.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(20, puffin.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(10, puffin.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("devoted", puffin.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("lipstick marks on neck");
        }}, puffin.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("0 to fam, 10 to foe", puffin.getThreatLevel());
    }

    @Test
    public void testSetMarried() {
        puffin.setMarried(false);
        Assert.assertFalse(puffin.getMarried());
    }
}
