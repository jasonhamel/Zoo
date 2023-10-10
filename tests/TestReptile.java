import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestReptile {

    Reptile reptile;

    @Before
    public void setup() throws Exception {
        reptile = new Reptile(false, false, true, "green", "Turtle Boy", 4, 3, "quiet",
                new HashSet<>(){{
                    add("yellow and brown spots on back of shell");
                    add("smiles");
                }}, "green");
    }

    @Test
    public void testGetPoisonous() {
        Assert.assertFalse(reptile.getPoisonous());
    }

    @Test
    public void testGetVenomous() {
        Assert.assertFalse(reptile.getVenomous());
    }

    @Test
    public void testGetShell() {
        Assert.assertTrue(reptile.getShell());
    }

    @Test
    public void testGetColour() throws Exception {
        Assert.assertEquals("green", reptile.getColour());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Turtle Boy", reptile.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(4, reptile.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(3, reptile.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("quiet", reptile.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("yellow and brown spots on back of shell");
            add("smiles");
        }}, reptile.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("green", reptile.getThreatLevel());
    }

    @Test
    public void testSetPoisonous() {
        reptile.setPoisonous(true);
        Assert.assertTrue(reptile.getPoisonous());
    }

    @Test
    public void testSetVenomous() {
        reptile.setVenomous(true);
        Assert.assertTrue(reptile.getVenomous());
    }

    @Test
    public void testSetShell() {
        reptile.setShell(false);
        Assert.assertFalse(reptile.getShell());
    }

    @Test
    public void testSetColour() throws Exception {
        reptile.setColour("brown and red stripes");
        Assert.assertEquals("brown and red stripes", reptile.getColour());
    }
}
