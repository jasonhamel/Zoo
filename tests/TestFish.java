import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestFish {

    Fish fish;

    @Before
    public void setup() throws Exception {
        fish = new Fish("red", "3 meters", "Bro", 1, 1, "none.",
                new HashSet<>(){{
                    add("black lines");
                    add("yellow fins");}}, "none");
    }

    @Test
    public void testGetColourOfScales() {
        Assert.assertEquals("red", fish.getColourOfScales());
    }

    @Test
    public void testGetDepth() {
        Assert.assertEquals("3 meters", fish.getDepth());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Bro", fish.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(1, fish.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(1, fish.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("none.", fish.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("black lines");
            add("yellow fins");
        }}, fish.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("none", fish.getThreatLevel());
    }

    @Test
    public void testSetColourOfScales() throws Exception {
        fish.setColourOfScales("green");
        Assert.assertEquals("green", fish.getColourOfScales());
    }

    @Test
    public void testSetDepth() throws Exception {
        fish.setDepth("10 meters");
        Assert.assertEquals("10 meters", fish.getDepth());
    }
}
