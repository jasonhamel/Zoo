import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

public class TestAnimal {
    Animal animal1;
    Animal animal2;
    @Before
    public void setup() {
        animal1 = new Animal("Argo", 70, 10, "Cuddle monster", new HashSet<String>(){{
            add("short yellow fur");
            add("eats a whole box of cereal off the counter");
        }}, "10 to cereal, -infinite to all else");
    }

    @Test
    public void testName() {
        Assert.assertEquals("Argo", animal1.getName());
    }
}

