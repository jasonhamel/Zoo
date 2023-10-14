import java.util.HashSet;

public class Cat extends Mammal {

    private boolean claws;
    private boolean friendly;
    private boolean needsToBeCarriedToBedAndTheLitter;

    public Cat(boolean claws, boolean friendly, boolean needsToBeCarriedToBedAndTheLitter, String furOrHairColour,
               boolean pregnant, int numberOfLegs, String name, int weight, int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(furOrHairColour, pregnant, numberOfLegs, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.claws = claws;
        this.friendly = friendly;
        this.needsToBeCarriedToBedAndTheLitter = needsToBeCarriedToBedAndTheLitter;
    }

    public boolean getClaws() {
        return claws;
    }

    public void setClaws(boolean claws) {
        this.claws = claws;
    }

    public boolean getFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public boolean getNeedsToBeCarriedToBedAndTheLitter() {
        return needsToBeCarriedToBedAndTheLitter;
    }

    public void setNeedsToBeCarriedToBedAndTheLitter(boolean needsToBeCarriedToBedAndTheLitter) {
        this.needsToBeCarriedToBedAndTheLitter = needsToBeCarriedToBedAndTheLitter;
    }
}
