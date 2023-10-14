import java.util.HashSet;

public class Giraffe extends Mammal {

    private int neckLength;
    private String leafColour;

    public Giraffe(int neckLength, String leafColour, String furOrHairColour, boolean pregnant, int numberOfLegs, String name,
                   int weight, int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(furOrHairColour, pregnant, numberOfLegs, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.neckLength = neckLength;
        this.leafColour = leafColour;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public String getLeafColour() {
        return leafColour;
    }

    public void setLeafColour(String leafColour) {
        this.leafColour = leafColour;
    }
}
