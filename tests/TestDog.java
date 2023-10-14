import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestDog {

    Dog dog;

    @Before
    public void setup() throws Exception {
        dog = new Dog(4, false, false, "yellow", false, 4, "Argo",
                70, 10, "chill vibes", new HashSet<>(){{add("sick eyebrows");}}, "literally none");
    }

    @Test
    public void testGetEarLength() {
        Assert.assertEquals(4, dog.getEarLength());
    }

    @Test
    public void testGetSheds() {
        Assert.assertFalse(dog.getSheds());
    }

    @Test
    public void testGetLoud() {
        Assert.assertFalse(dog.getLoud());
    }

    @Test
    public void testGetFurOrHairColour() {
        Assert.assertEquals("yellow", dog.getFurOrHairColour());
    }

    @Test
    public void testGetPregnant() {
        Assert.assertFalse(dog.getPregnant());
    }

    @Test
    public void testGetNumberOfLegs() {
        Assert.assertEquals(4, dog.getNumberOfLegs());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Argo", dog.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(70, dog.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(10, dog.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("chill vibes", dog.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<String>(){{
          add("sick eyebrows");
        }}, dog.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("literally none", dog.getThreatLevel());
    }

    @Test
    public void testSetEarLength() {
        dog.setEarLength(100);
        Assert.assertEquals(100, dog.getEarLength());
    }

    @Test
    public void testSetSheds() {
        dog.setSheds(true);
        Assert.assertTrue(dog.getSheds());
    }

    @Test
    public void testSetLoud() {
        dog.setLoud(true);
        Assert.assertTrue(dog.getLoud());
    }
}
