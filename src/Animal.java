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
        validateName(name);
        this.name = name;

        validateWeight(weight);
        this.weight = weight;

        validateCuteFactor(cuteFactor);
        this.cuteFactor = cuteFactor;

        validatePersonality(personality);
        this.personality = personality;

        validatePhysicalFeatures(physicalFeatures);
        this.physicalFeatures = physicalFeatures;

        validateThreatLevel(threatLevel);
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
        validateName(name);
        this.name = name;
    }

    public void setWeight(int weight) throws Exception {
        validateWeight(weight);
        this.weight = weight;
    }

    public void setCuteFactor(int cuteFactor) throws Exception {
        validateCuteFactor(cuteFactor);
        this.cuteFactor = cuteFactor;
    }

    public void setPersonality(String personality) throws Exception {
        validatePersonality(personality);
        this.personality = personality;
    }

    public void addPhysicalFeature(String physicalFeature) throws Exception {
        validatePhysicalFeature(physicalFeature);
        if (physicalFeatures.contains(physicalFeature)) {
            return;
        }
        this.physicalFeatures.add(physicalFeature);
    }

    public void removePhysicalFeature(String physicalFeature) throws Exception {
        validatePhysicalFeature(physicalFeature);
        physicalFeatures.remove(physicalFeature);

    }

    public void setThreatLevel(String threatLevel) throws Exception {
        validateThreatLevel(threatLevel);
        this.threatLevel = threatLevel;
    }

    private void validateName(String name) throws Exception {
        if (name.isBlank() || name.isEmpty()) {
            throw new Exception("Name cannot be blank");
        }
    }

    private void validateWeight(int weight) throws Exception {
        if (weight <= 0) {
            throw new Exception("Weight cannot be zero or a negative number");
        }
    }

    private void validateCuteFactor(int cuteFactor) throws Exception {
        if (cuteFactor > 10 || cuteFactor < 0) {
            throw new Exception("Please enter a cute factor between 0 and 10");
        }
    }

    private void validatePersonality(String personality) throws Exception {
        if (personality.isBlank() || personality.isEmpty()) {
            throw new Exception("Please enter a personality for the animal");
        }
    }

    private void validatePhysicalFeatures(HashSet<String> physicalFeatures) throws Exception {
        if (physicalFeatures.isEmpty()) {
            throw new Exception("Please enter at least one identifying feature");
        }
    }

    private void validatePhysicalFeature(String physicalFeature) throws Exception {
        if (physicalFeature.isEmpty() || physicalFeature.isBlank()) {
            throw new Exception("Please enter a new identifying feature");
        }
    }

    private void validateThreatLevel(String threatLevel) throws Exception{
        if(threatLevel.isBlank() || threatLevel.isEmpty()) {
            throw new Exception("Please enter a threat level");
        }
    }
}
