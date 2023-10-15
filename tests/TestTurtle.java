import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestTurtle {

    Turtle turtle;

    @Before
    public void setup() throws Exception {
        turtle = new Turtle("fresh", false, false, true, "green", "Torts",
                50, 4, "used to getting shelled", new HashSet<>(){{add("long toenails");}}, "very little");
    }

    @Test
    public void testGetFreshWaterOrSaltWater() {
        Assert.assertEquals("fresh", turtle.getSeaWaterOrSaltWater());
    }

    @Test
    public void testGetPoisonous() {
        Assert.assertFalse(turtle.getPoisonous());
    }

    @Test
    public void testGetVenomous() {
        Assert.assertFalse(turtle.getVenomous());
    }

    @Test
    public void testGetShell() {
        Assert.assertTrue(turtle.getShell());
    }

    @Test
    public void testGetColour() throws Exception {
        Assert.assertEquals("green", turtle.getColour());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Torts", turtle.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(50, turtle.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(4, turtle.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("used to getting shelled", turtle.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("long toenails");
        }}, turtle.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("very little", turtle.getThreatLevel());
    }

    @Test
    public void testSetFreshWaterOrSaltWater() {
        turtle.setSeaWaterOrSaltWater("salt");
        Assert.assertEquals("salt", turtle.getSeaWaterOrSaltWater());
    }
}
