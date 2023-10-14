import java.util.HashSet;

public class Clownfish extends Fish {

    private boolean missing;

    public Clownfish(boolean missing, String colourOfScales, String depth, String name, int weight, int cuteFactor, String personality,
                     HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(colourOfScales, depth, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.missing = missing;
    }

    public boolean getMissing() {
        return missing;
    }

    public void setMissing(boolean missing) {
        this.missing = missing;
    }
}
