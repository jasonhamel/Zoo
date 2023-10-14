import java.util.HashSet;

public class Eel extends Fish {

    private boolean electric;

    public Eel(boolean electric, String colourOfScales, String depth, String name, int weight, int cuteFactor, String personality,
               HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(colourOfScales, depth, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.electric = electric;
    }

    public boolean getElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
