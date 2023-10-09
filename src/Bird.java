import java.util.HashSet;

public class Bird extends Animal{
    private int wingspan;
    private boolean canFly;
    private boolean canSwim;

    public Bird(int wingspan, boolean canFly, boolean canSwim, String name, int weight, int cuteFactor,
                String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        validateWingspan(wingspan);
        this.wingspan = wingspan;

        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "wingspan: " + wingspan + "\n" +
                "canFly: " + canFly + "\n" +
                "canSwim: " + canSwim + "\n" +
                "name: " + super.getName() + "\n" +
                "weight: " + super.getWeight() + "\n" +
                "cutefactor: " + super.getCuteFactor() + "\n" +
                "personality: " + super.getPersonality() + "\n" +
                "physical features: " + super.getPhysicalFeatures() + "\n" +
                "threat level: " + super.getThreatLevel();
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) throws Exception {
        validateWingspan(wingspan);
        this.wingspan = wingspan;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    private void validateWingspan(int wingspan) throws Exception {
        if (wingspan <= 0) {
            throw new Exception("Wingspan needs to be greater than 0");
        }
    }
}
