import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestGiraffe {

    Giraffe giraffe;

    @Before
    public void setup() throws Exception{
        giraffe = new Giraffe(50, "green", "brown and yellow", true, 4, "Gira",
                1000, 6, "scared", new HashSet<>(){{
                    add("missing tail");
        }}, "bread");
    }

    @Test
    public void testGetNeckLength() {
        Assert.assertEquals(50, giraffe.getNeckLength());
    }

    @Test
    public void testGetLeafColour() {
        Assert.assertEquals("green", giraffe.getLeafColour());
    }

    @Test
    public void testGetFurOrHairColour() {
        Assert.assertEquals("brown and yellow", giraffe.getFurOrHairColour());
    }

    @Test
    public void testGetPregnant() {
        Assert.assertTrue(giraffe.getPregnant());
    }

    @Test
    public void testGetNumberOfLegs() {
        Assert.assertEquals(4, giraffe.getNumberOfLegs());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Gira", giraffe.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(1000, giraffe.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(6, giraffe.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("scared", giraffe.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<String>(){{
            add("missing tail");
        }}, giraffe.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("bread", giraffe.getThreatLevel());
    }

    @Test
    public void testSetNeckLength() {
        giraffe.setNeckLength(75);
        Assert.assertEquals(75, giraffe.getNeckLength());
    }

    @Test
    public void testSetLeafColour() {
        giraffe.setLeafColour("brown");
        Assert.assertEquals("brown", giraffe.getLeafColour());
    }
}
