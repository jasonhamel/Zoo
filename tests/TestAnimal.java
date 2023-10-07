import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

public class TestAnimal {
    Animal animal1;
    @Before
    public void setup() throws Exception {
        animal1 = new Animal("Argo", 70, 10, "Cuddle monster", new HashSet<>(){{
            add("short yellow fur");
            add("eats a whole box of cereal off the counter");
        }}, "10 to cereal, -infinite to all else");
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Argo", animal1.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(70, animal1.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(10, animal1.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("Cuddle monster", animal1.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("short yellow fur");
            add("eats a whole box of cereal off the counter");
        }}, animal1.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("10 to cereal, -infinite to all else", animal1.getThreatLevel());
    }

    @Test
    public void testSetName() throws Exception {
        animal1.setName("Iris");
        Assert.assertEquals("Iris", animal1.getName());
    }

    @Test
    public void testSetWeight() throws Exception{
        animal1.setWeight(70);
        Assert.assertEquals(70, animal1.getWeight());
    }

    @Test
    public void testSetCuteFactor() throws Exception{
        animal1.setCuteFactor(9);
        Assert.assertEquals(9, animal1.getCuteFactor());
    }

    @Test
    public void testSetPersonality() throws Exception{
        animal1.setPersonality("The best");
        Assert.assertEquals("The best", animal1.getPersonality());
    }

    @Test
    public void testAddPhysicalFeatures() throws Exception{
        animal1.addPhysicalFeature("Crazy eyebrows");
        Assert.assertTrue(animal1.getPhysicalFeatures().contains("Crazy eyebrows"));
        animal1.addPhysicalFeature("Crazy eyebrows");
    }

    @Test
    public void testRemovePhysicalFeatures() throws Exception{
        animal1.removePhysicalFeature("short yellow fur");
        Assert.assertFalse(animal1.getPhysicalFeatures().contains("short yellow fur"));
        animal1.removePhysicalFeature("short yellow fur");
    }
    @Test
    public void testSetThreatLevel() throws Exception{
        animal1.setThreatLevel("midnight");
        Assert.assertEquals("midnight", animal1.getThreatLevel());
    }
}

