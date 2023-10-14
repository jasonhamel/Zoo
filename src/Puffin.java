import java.util.HashSet;

public class Puffin extends Bird {

    private boolean married;

    public Puffin(boolean married, int wingspan, boolean canFly, boolean canSwim, String name, int weight,
                  int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(wingspan, canFly, canSwim, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.married = married;
    }

    public boolean getMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
