import java.util.HashSet;

public class Shark extends Fish {

    private int rowsOfTeeth;

    public Shark(int rowsOfTeeth, String colourOfScales, String depth, String name, int weight, int cuteFactor, String personality,
                 HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(colourOfScales, depth, name, weight, cuteFactor, personality, physicalFeatures, threatLevel);

        this.rowsOfTeeth = rowsOfTeeth;
    }

    public int getRowsOfTeeth() {
        return rowsOfTeeth;
    }

    public void setRowsOfTeeth(int rowsOfTeeth) {
        this.rowsOfTeeth = rowsOfTeeth;
    }
}
