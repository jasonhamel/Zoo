import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestEel {

    Eel eel;

    @Before
    public void setup() throws Exception {
        eel = new Eel(false, "green", "500", "Worm", 5, 0, "shocking",
                new HashSet<>(){{
                    add("underbite");
                }}, "moderate");
    }

    @Test
    public void testGetElectric() {
        Assert.assertFalse(eel.getElectric());
    }

    @Test
    public void testGetColourOfScales() {
        Assert.assertEquals("green", eel.getColourOfScales());
    }

    @Test
    public void testGetDepth() {
        Assert.assertEquals("500", eel.getDepth());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Worm", eel.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(5, eel.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(0, eel.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("shocking", eel.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("underbite");
        }}, eel.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("moderate", eel.getThreatLevel());
    }

    @Test
    public void testSetElectric() {
        eel.setElectric(true);
        Assert.assertTrue(eel.getElectric());
    }
}
