import java.util.HashSet;

public class Chameleon extends Reptile {

    private boolean omnivore;

    public Chameleon(boolean omnivore, boolean poisonous, boolean venomous, boolean shell, String colour, String name, int weight, int cuteFactor, String personality,
                     HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(poisonous, venomous, shell, colour, name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        this.omnivore = omnivore;
    }

    public boolean getOmnivore() {
        return omnivore;
    }

    public void setOmnivore(boolean omnivore) {
        this.omnivore = omnivore;
    }
}
