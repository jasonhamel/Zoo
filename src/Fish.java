import java.util.HashSet;

public class Fish extends Animal{

    private String colourOfScales;
    private String depth;

    public Fish (String colourOfScales, String depth, String name, int weight, int cuteFactor, String personality,
                 HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        validateStrings(colourOfScales);
        this.colourOfScales = colourOfScales;

        validateStrings(depth);
        this.depth = depth;
    }

    public String getColourOfScales() {
        return colourOfScales;
    }

    public void setColourOfScales(String colourOfScales) throws Exception{
        validateStrings(colourOfScales);
        this.colourOfScales = colourOfScales;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) throws Exception {
        validateStrings(depth);
        this.depth = depth;
    }

    private void validateStrings(String string) throws Exception {
        if (string.isBlank() || string.isEmpty()) {
            throw new Exception("Colour of Scales and Depth cannot be blank");
        }
    }
}
