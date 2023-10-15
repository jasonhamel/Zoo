import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestSnake {

    Snake snake;

    @Before
    public void set() throws Exception {
        snake = new Snake(true, false, false, true, false, "brown", "Slith",
                3, 2, "standoffish", new HashSet<>(){{add("one eye");}}, "10");
    }

    @Test
    public void testGetRattle() {
        Assert.assertTrue(snake.getRattle());
    }

    @Test
    public void testGetConstrictor() {
        Assert.assertFalse(snake.getConstrictor());
    }

    @Test
    public void testGetPoisonous() {
        Assert.assertFalse(snake.getPoisonous());
    }

    @Test
    public void testGetVenomous() {
        Assert.assertTrue(snake.getVenomous());
    }

    @Test
    public void testGetShell() {
        Assert.assertFalse(snake.getShell());
    }

    @Test
    public void testGetColour() throws Exception {
        Assert.assertEquals("brown", snake.getColour());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Slith", snake.getName());
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(3, snake.getWeight());
    }

    @Test
    public void testGetCuteFactor() {
        Assert.assertEquals(2, snake.getCuteFactor());
    }

    @Test
    public void testGetPersonality() {
        Assert.assertEquals("standoffish", snake.getPersonality());
    }

    @Test
    public void testGetPhysicalFeatures() {
        Assert.assertEquals(new HashSet<>(){{
            add("one eye");
        }}, snake.getPhysicalFeatures());
    }

    @Test
    public void testGetThreatLevel() {
        Assert.assertEquals("10", snake.getThreatLevel());
    }

    @Test
    public void testSetRattle() {
        snake.setRattle(false);
        Assert.assertFalse(snake.getRattle());
    }

    @Test
    public void testSetConstrictor() {
        snake.setConstrictor(true);
        Assert.assertTrue(snake.getConstrictor());
    }
}
