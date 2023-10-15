import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestChameleon {

    Chameleon chameleon;

    @Before
    public void setup() throws Exception {
        chameleon = new Chameleon(true, false, false, false, "all", "Cam", 2,
                5, "shy", new HashSet<>(){{add("scar");}}, "nah");
    }

    @Test
    public void testGetOmnivore() {
        Assert.assertTrue(chameleon.getOmnivore());
    }

    @Test
    public void testGetPoisonous() {
        Assert.assertFalse(chameleon.getPoisonous());
    }

    @Test
    public void testGetVenomous() {
        Assert.assertFalse(chameleon.getVenomous());
    }

    @Test
    public void testGetShell() {
        Assert.assertFalse(chameleon.getShell());
    }

    @Test
    public void testGetColour() throws Exception {
        Assert.assertEquals("all", chameleon.getColour());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Cam", chameleon.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(2, chameleon.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(5, chameleon.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("shy", chameleon.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("scar");
        }}, chameleon.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("nah", chameleon.getThreatLevel());
    }

    @Test
    public void testSetOmnivore() {
        chameleon.setOmnivore(false);
        Assert.assertFalse(chameleon.getOmnivore());
    }
}
