import java.util.HashSet;

public class Dog extends Mammal {

    private int earLength;
    private boolean sheds;

    private boolean loud;

    public Dog(int earLength, boolean sheds, boolean loud, String furOrHairColour, boolean pregnant, int numberOfLegs, String name,
               int weight, int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(furOrHairColour, pregnant, numberOfLegs, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.earLength = earLength;
        this.sheds = sheds;
        this.loud = loud;
    }

    public int getEarLength() {
        return earLength;
    }

    public void setEarLength(int earLength) {
        this.earLength = earLength;
    }

    public boolean getSheds() {
        return sheds;
    }

    public void setSheds(boolean sheds) {
        this.sheds = sheds;
    }

    public boolean getLoud() {
        return loud;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }
}
