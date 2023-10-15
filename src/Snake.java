import java.util.HashSet;

public class Snake extends Reptile{

    private boolean rattle;
    private boolean constrictor;

    public Snake(boolean rattle, boolean constrictor, boolean poisonous, boolean venomous, boolean shell, String colour, String name, int weight, int cuteFactor, String personality,
                 HashSet<String> physicalFeatures, String threatLevel) throws Exception {

        super(poisonous, venomous, shell, colour, name, weight, cuteFactor, personality,
                physicalFeatures, threatLevel);

        this.rattle = rattle;
        this.constrictor = constrictor;
    }

    public boolean getRattle() {
        return rattle;
    }

    public void setRattle(boolean rattle) {
        this.rattle = rattle;
    }

    public boolean getConstrictor() {
        return constrictor;
    }

    public void setConstrictor(boolean constrictor) {
        this.constrictor = constrictor;
    }
}
