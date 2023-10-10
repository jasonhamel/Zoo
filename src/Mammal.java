import java.util.HashSet;

public class Mammal extends Animal{
    private String furOrHairColour;
    private boolean pregnant;
    private int numberOfLegs;

    public Mammal(String furOrHairColour, boolean pregnant, int numberOfLegs, String name, int weight, int cuteFactor, String personality,
                   HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        validateFurOrHairColour(furOrHairColour);
        this.furOrHairColour = furOrHairColour;

        this.pregnant = pregnant;

        validateNumberOfLegs(numberOfLegs);
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurOrHairColour() {
        return furOrHairColour;
    }

    public void setFurOrHairColour(String furOrHairColour) {
        this.furOrHairColour = furOrHairColour;
    }

    public boolean getPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    private void validateFurOrHairColour(String furOrHairColour) throws Exception{
        if (furOrHairColour.isEmpty() || furOrHairColour.isBlank()) {
            throw new Exception("Fur/Hair colour cannot be blank");
        }
    }

    private void validateNumberOfLegs(int numberOfLegs) throws Exception {
        if (numberOfLegs > 4 || numberOfLegs < 0) {
            throw new Exception("Number of legs must be between 0 and 4");
        }
    }
}
