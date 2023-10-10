import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestMammal {
    Mammal mammal;

    @Before
    public void setup() throws Exception {
        mammal = new Mammal("Brown", false, 4, "Smokey", 900, 3, "mean",
                new HashSet<>(){{
                    add("scarred face");
                    add("black muzzle");
                }}, "midnight");
    }

    @Test
    public void testGetFurOrHairColour() {
        Assert.assertEquals("Brown", mammal.getFurOrHairColour());
    }

    @Test
    public void testGetPregnant() {
        Assert.assertFalse(mammal.getPregnant());
    }

    @Test
    public void testGetNumberOfLegs() {
        Assert.assertEquals(4, mammal.getNumberOfLegs());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Smokey", mammal.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(900, mammal.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(3, mammal.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("mean", mammal.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("scarred face");
            add("black muzzle");
        }}, mammal.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("midnight", mammal.getThreatLevel());
    }

    @Test
    public void testSetFurOrHairColour() {
        mammal.setFurOrHairColour("black");
        Assert.assertEquals("black", mammal.getFurOrHairColour());
    }

    @Test
    public void testSetPregnant() {
        mammal.setPregnant(true);
        Assert.assertTrue(mammal.getPregnant());
    }

    @Test
    public void testSetNumberOfLegs() {
        mammal.setNumberOfLegs(3);
        Assert.assertEquals(3, mammal.getNumberOfLegs());
    }
}
