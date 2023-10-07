import java.util.HashSet;

public class Animal {
    private String name;
    private int weight;
    private int cuteFactor;
    private String personality;
    private HashSet<String> physicalFeatures;
    private String threatLevel;

    public Animal(String name, int weight, int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) throws Exception {
        /*
        Error handling would be on user input, but because I'm not making a main method and not actually going to
        collect input, I'll put error handling here instead.
         */
        if (name.isBlank() || name.isEmpty()) {
            throw new Exception("Name cannot be blank");
        }
        this.name = name;

        if (weight <= 0) {
            throw new Exception("Weight cannot be zero or a negative number");
        }
        this.weight = weight;

        if (cuteFactor > 10 || cuteFactor < 0) {
            throw new Exception("Please enter a cute factor between 0 and 10");
        }
        this.cuteFactor = cuteFactor;

        if (personality.isBlank() || personality.isEmpty()) {
            throw new Exception("Please enter a personality for the animal");
        }
        this.personality = personality;

        if (physicalFeatures.isEmpty()) {
            throw new Exception("Please enter at least one identifying feature");
        }
        this.physicalFeatures = physicalFeatures;

        if(threatLevel.isBlank() || threatLevel.isEmpty()) {
            throw new Exception("Please enter a threat level");
        }
        this.threatLevel = threatLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCuteFactor() {
        return this.cuteFactor;
    }

    public String getPersonality() {
     return this.personality;
    }

    public HashSet<String> getPhysicalFeatures() {
        return this.physicalFeatures;
    }

    public String getThreatLevel() {
        return this.threatLevel;
    }

    public void setName(String name) throws Exception {
        if (name.isBlank() || name.isEmpty()) {
            throw new Exception("Name cannot be blank");
        }
        this.name = name;
    }

    public void setWeight(int weight) throws Exception {
        if (weight <= 0) {
            throw new Exception("Weight cannot be zero or a negative number");
        }
        this.weight = weight;
    }

    public void setCuteFactor(int cuteFactor) throws Exception {
        if (cuteFactor > 10 || cuteFactor < 0) {
            throw new Exception("Please enter a cute factor between 0 and 10");
        }
        this.cuteFactor = cuteFactor;
    }

    public void setPersonality(String personality) throws Exception {
        if (personality.isBlank() || personality.isEmpty()) {
            throw new Exception("Please enter a personality for the animal");
        }
        this.personality = personality;
    }

    public void addPhysicalFeature(String physicalFeature) throws Exception {
        if (physicalFeature.isEmpty() || physicalFeature.isBlank()) {
            throw new Exception("Please enter a new identifying feature to add");
        }
        if (physicalFeatures.contains(physicalFeature)) {
            System.out.println("Already added. Took no action here");
            return;
        }
        this.physicalFeatures.add(physicalFeature);
    }

    public void removePhysicalFeature(String physicalFeature) throws Exception {
        if (physicalFeature.isEmpty() || physicalFeature.isBlank()) {
            throw new Exception("Please enter an identifying feature to remove");
        }
        if (physicalFeatures.contains(physicalFeature)) {
            physicalFeatures.remove(physicalFeature);
            return;
        }
        System.out.println("Feature not present. Took no action here");
    }

    public void setThreatLevel(String threatLevel) throws Exception {
        if(threatLevel.isBlank() || threatLevel.isEmpty()) {
            throw new Exception("Please enter a threat level");
        }
        this.threatLevel = threatLevel;
    }
}
