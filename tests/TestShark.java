import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestShark {

    Shark shark;

    @Before
    public void setup() throws Exception {
        shark = new Shark(3, "blue", "100", "Sharknado", 200, 0, "mean",
                new HashSet<>(){{
                    add("big ass scars");
                }}, "higher than that");
    }

    @Test
    public void testGetRowsOfTeeth() {
        Assert.assertEquals(3, shark.getRowsOfTeeth());
    }

    @Test
    public void testGetColourOfScales() {
        Assert.assertEquals("blue", shark.getColourOfScales());
    }

    @Test
    public void testGetDepth() {
        Assert.assertEquals("100", shark.getDepth());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Sharknado", shark.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(200, shark.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(0, shark.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("mean", shark.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("big ass scars");
        }}, shark.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("higher than that", shark.getThreatLevel());
    }

    @Test
    public void testSetRowsOfTeeth() {
        shark.setRowsOfTeeth(2);
        Assert.assertEquals(2, shark.getRowsOfTeeth());
    }
}
