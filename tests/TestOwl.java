import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestOwl {

    Owl owl;

    @Before
    public void setup() throws Exception {
        owl = new Owl(270, 20, true, false, "Hootsy", 10, 8, "shy",
                new HashSet<>(){{
                    add("crazy long eyebrows");
                }}, "silent but deadly");
    }

    @Test
    public void testGetRotationDegrees() {
        Assert.assertEquals(270, owl.getRotationDegrees());
    }

    @Test
    public void testGetWingspan() {
        Assert.assertEquals(20, owl.getWingspan());
    }

    @Test
    public void testGetCanFly() {
        Assert.assertTrue(owl.getCanFly());
    }

    @Test
    public void testGetCanSwim() {
        Assert.assertFalse(owl.getCanSwim());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Hootsy", owl.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(10, owl.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(8, owl.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("shy", owl.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("crazy long eyebrows");
        }}, owl.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("silent but deadly", owl.getThreatLevel());
    }

    @Test
    public void testSetRotationDegrees() {
        owl.setRotationDegrees(180);
        Assert.assertEquals(180, owl.getRotationDegrees());
    }
}
