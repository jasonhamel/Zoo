import java.util.HashSet;

public class Penguin extends Bird {

    private boolean marching;

    public Penguin(boolean marching, int wingspan, boolean canFly, boolean canSwim, String name, int weight,
                   int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(wingspan, canFly, canSwim, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.marching = marching;
    }

    public boolean getMarching() {
        return marching;
    }

    public void setMarching(boolean marching) {
        this.marching = marching;
    }
}
