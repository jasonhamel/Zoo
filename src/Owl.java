import java.util.HashSet;

public class Owl extends Bird {

    private int rotationDegrees;

    public Owl(int rotationDegrees, int wingspan, boolean canFly, boolean canSwim, String name, int weight,
               int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(wingspan, canFly, canSwim, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.rotationDegrees = rotationDegrees;
    }

    public int getRotationDegrees() {
        return rotationDegrees;
    }

    public void setRotationDegrees(int rotationDegrees) {
        this.rotationDegrees = rotationDegrees;
    }
}
