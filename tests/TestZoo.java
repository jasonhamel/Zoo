import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

public class TestZoo {

    Zoo zoo;
    Clownfish clownfish;
    Eel eel;
    Shark shark;
    Cat cat;
    Dog dog;
    Giraffe giraffe;
    Owl owl;
    Penguin penguin;
    Puffin puffin;
    Chameleon chameleon;
    Snake snake;
    Turtle turtle;

    @Before
    public void set() throws Exception {
        zoo = new Zoo();
        clownfish = new Clownfish(true, "Orange", "reef deep", "Nemo", 1, 7,
                "forgetful", new HashSet<>(){{add("white stripes");}}, "zero");
        eel = new Eel(true, "red", "bottom", "Eel-ectric", 10, 0, "slippery",
                new HashSet<>(){{add("chipped fangs");}}, "will eat you");
        shark = new Shark(2, "blue", "500", "Sea Bear", 200, 3, "mean",
                new HashSet<>(){{add("missing two middle teeth");}}, "midnight");
        cat = new Cat(true, true, true, "brown", false, 4, "Iris",
                10, 8, "bitchy", new HashSet<>(){{add("one eye");}}, "claws and teeth");
        dog = new Dog(10, true, false, "yellow", false, 4, "Argo", 70, 10,"cuddles",
                new HashSet<>(){{add("expressive eyebrows");}}, "none at all");
        giraffe = new Giraffe(69, "green", "brown and yellow", true, 4, "Gira",
                800, 5, "acts tall", new HashSet<>(){{add("missing tail");}}, "not much");
        owl = new Owl(270, 40, true, false, "Hootsy", 20, 3, "night owl",
                new HashSet<>(){{add("big spots in white feathers");}}, "silent but deadly");
        penguin = new Penguin(true, 30, false, true, "Pingu", 40, 8, "formal",
                new HashSet<>(){{add("winking all the time");}}, "don't stand at the bottom of the slippin slide");
        puffin = new Puffin(true, 30, true, false, "Puff", 20, 10, "Endeering",
                new HashSet<>(){{add("partner's feathers all over it");}}, "nope");
        chameleon = new Chameleon(true, false, false, false, "all", "Cam", 3, 3,
                "shy", new HashSet<>(){{add("impossible to tell");}}, "the bottom");
        snake = new Snake(true, false, false, true, false, "brown", "Esses",
                30, 0, "not much of a talker", new HashSet<>(){{add("tip of tail missing");}}, "terror");
        turtle = new Turtle("fresh", false, false, true, "blue", "Torts", 50,
                6, "slow", new HashSet<>(){{add("real long tail");}}, "nah bro");
    }

    @Test
    public void testAddOneAquarium() {
        zoo.addAquarium(eel);
        Assert.assertTrue(zoo.getAllBirds().isEmpty());
        Assert.assertTrue(zoo.getAllMammals().isEmpty());
        Assert.assertTrue(zoo.getAllReptiles().isEmpty());
        Assert.assertFalse(zoo.getAllFish().isEmpty());
    }

    @Test
    public void testAddOneAviary() {
        zoo.addAviary(penguin);
        Assert.assertTrue(zoo.getAllMammals().isEmpty());
        Assert.assertTrue(zoo.getAllReptiles().isEmpty());
        Assert.assertTrue(zoo.getAllFish().isEmpty());
        Assert.assertFalse(zoo.getAllBirds().isEmpty());
    }

    @Test
    public void testAddOneHerpetarium() {
        zoo.addHerpetarium(turtle);
        Assert.assertTrue(zoo.getAllBirds().isEmpty());
        Assert.assertTrue(zoo.getAllMammals().isEmpty());
        Assert.assertTrue(zoo.getAllFish().isEmpty());
        Assert.assertFalse(zoo.getAllReptiles().isEmpty());
    }

    @Test
    public void testAddOnePen() {
        zoo.addPen(dog);
        Assert.assertTrue(zoo.getAllBirds().isEmpty());
        Assert.assertTrue(zoo.getAllReptiles().isEmpty());
        Assert.assertTrue(zoo.getAllFish().isEmpty());
        Assert.assertFalse(zoo.getAllMammals().isEmpty());
    }

    @Test
    public void testGetFromAquarium() {
        zoo.addAquarium(clownfish);
        zoo.addAquarium(eel);
        zoo.addAquarium(shark);
        Assert.assertEquals("Nemo", zoo.getOne(clownfish, "Nemo").getName());
        Assert.assertEquals("Eel-ectric", zoo.getOne(eel, "Eel-ectric").getName());
        Assert.assertEquals("Sea Bear", zoo.getOne(shark, "Sea Bear").getName());
    }

    @Test
    public void testGetFromAviary() {
        zoo.addAviary(owl);
        zoo.addAviary(penguin);
        zoo.addAviary(puffin);
        Assert.assertEquals("Hootsy", zoo.getOne(owl, "Hootsy").getName());
        Assert.assertEquals("Pingu", zoo.getOne(penguin, "Pingu").getName());
        Assert.assertEquals("Puff", zoo.getOne(puffin, "Puff").getName());
    }

    @Test
    public void testGetFromHerpetarium() {
        zoo.addHerpetarium(chameleon);
        zoo.addHerpetarium(snake);
        zoo.addHerpetarium(turtle);
        Assert.assertEquals("Cam", zoo.getOne(chameleon, "Cam").getName());
        Assert.assertEquals("Esses", zoo.getOne(snake, "Esses").getName());
        Assert.assertEquals("Torts", zoo.getOne(turtle, "Torts").getName());
    }

    @Test
    public void testGetFromPen() {
        zoo.addPen(cat);
        zoo.addPen(dog);
        zoo.addPen(giraffe);
        Assert.assertEquals("Iris", zoo.getOne(cat, "Iris").getName());
        Assert.assertEquals("Argo", zoo.getOne(dog, "Argo").getName());
        Assert.assertEquals("Gira", zoo.getOne(giraffe, "Gira").getName());
    }

    @Test
    public void testRemove() {
        zoo.addPen(cat);
        zoo.addPen(dog);
        zoo.addAquarium(eel);
        Assert.assertTrue(zoo.getAllBirds().isEmpty());
        Assert.assertTrue(zoo.getAllReptiles().isEmpty());
        Assert.assertFalse(zoo.getAllMammals().isEmpty());
        Assert.assertFalse(zoo.getAllFish().isEmpty());
        zoo.remove(eel, eel.getName());
        Assert.assertTrue(zoo.getAllFish().isEmpty());
        zoo.remove(cat, cat.getName());
        Assert.assertFalse(zoo.getAllMammals().isEmpty());
    }
}
