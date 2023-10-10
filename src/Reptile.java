import java.util.HashSet;

public class Reptile extends Animal{

    private boolean poisonous;
    private boolean venomous;

    private boolean shell;

    private String colour;

    public Reptile(boolean poisonous, boolean venomous, boolean shell, String colour, String name, int weight, int cuteFactor, String personality,
                   HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        super(name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        this.poisonous = poisonous;
        this.venomous = venomous;
        this.shell = shell;

        validateColour(colour);
        this.colour = colour;
    }

    public boolean getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean getVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    public boolean getShell() {
        return shell;
    }

    public void setShell(boolean shell) {
        this.shell = shell;
    }

    public String getColour() throws Exception {
        validateColour(colour);
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void validateColour(String colour) throws Exception{
        if (colour.isBlank() || colour.isEmpty()) {
            throw new Exception("Colour cannot be blank");
        }
    }
}
