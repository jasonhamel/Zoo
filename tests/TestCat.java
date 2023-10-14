import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestCat {

    Cat cat;

    @Before
    public void setup() throws Exception {
        cat = new Cat(true, true, true, "black", false, 4,
                "Iris", 8, 9, "aloof", new HashSet<>(){{
                    add("one eye");
        }}, "don't get cocky");
    }

    @Test
    public void getClaws() {
        Assert.assertTrue(cat.getClaws());
    }

    @Test
    public void getFriendly() {
        Assert.assertTrue(cat.getFriendly());
    }

    @Test
    public void getNeedsToBeCarriedToBedAndTheLitter() {
        Assert.assertTrue(cat.getNeedsToBeCarriedToBedAndTheLitter());
    }

    @Test
    public void testGetFurOrHairColour() {
        Assert.assertEquals("black", cat.getFurOrHairColour());
    }

    @Test
    public void testGetPregnant() {
        Assert.assertFalse(cat.getPregnant());
    }

    @Test
    public void testGetNumberOfLegs() {
        Assert.assertEquals(4, cat.getNumberOfLegs());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Iris", cat.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(8, cat.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(9, cat.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("aloof", cat.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<String>(){{
            add("one eye");
        }}, cat.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("don't get cocky", cat.getThreatLevel());
    }

    @Test
    public void testSetClaws() {
        cat.setClaws(false);
        Assert.assertFalse(cat.getClaws());
    }

    @Test
    public void testSetFriendly() {
        cat.setFriendly(false);
        Assert.assertFalse(cat.getFriendly());
    }

    @Test
    public void testNeedsToBeCarriedToBedAndTheLitter() {
        cat.setNeedsToBeCarriedToBedAndTheLitter(false);
        Assert.assertFalse(cat.getNeedsToBeCarriedToBedAndTheLitter());
    }
}
