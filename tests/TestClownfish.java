import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestClownfish {

    Clownfish clownfish;

    @Before
    public void setup() throws Exception {
        clownfish = new Clownfish(false, "orange", "bottom", "Nemo", 1, 7,
                "what?", new HashSet<>(){{
                    add("wide eyes");
        }}, "bottom");
    }

    @Test
    public void testGetMissing() {
        Assert.assertFalse(clownfish.getMissing());
    }

    @Test
    public void testGetColourOfScales() {
        Assert.assertEquals("orange", clownfish.getColourOfScales());
    }

    @Test
    public void testGetDepth() {
        Assert.assertEquals("bottom", clownfish.getDepth());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Nemo", clownfish.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(1, clownfish.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(7, clownfish.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("what?", clownfish.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("wide eyes");
        }}, clownfish.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("bottom", clownfish.getThreatLevel());
    }

    @Test
    public void testSetMissing() {
        clownfish.setMissing(true);
        Assert.assertTrue(clownfish.getMissing());
    }
}
