import java.util.HashSet;

public class Turtle extends Reptile {

    private String freshWaterOrSaltWater;

    public Turtle(String freshWaterOrSaltWater, boolean poisonous, boolean venomous, boolean shell, String colour, String name, int weight, int cuteFactor, String personality,
                  HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(poisonous, venomous, shell, colour, name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        this.freshWaterOrSaltWater = freshWaterOrSaltWater;
    }

    public String getSeaWaterOrSaltWater() {
        return freshWaterOrSaltWater;
    }

    public void setSeaWaterOrSaltWater(String freshWaterOrSaltWater) {
        this.freshWaterOrSaltWater = freshWaterOrSaltWater;
    }
}
