import java.util.HashSet;

public class Animal {
    private String name;
    private int weight;
    private int cuteFactor;
    private String personality;
    private HashSet<String> physicalFeatures;
    private String threatLevel;

    public Animal(String name, int weight, int cuteFactor, String personality, HashSet<String> physicalFeatures, String threatLevel) {
        this.name = name;
        this.weight = weight;
        this.cuteFactor = cuteFactor;
        this.personality = personality;
        this.physicalFeatures = physicalFeatures;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCuteFactor(int cuteFactor) {
        this.cuteFactor = cuteFactor;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public void addPhysicalFeature(String physicalFeature) {
        this.physicalFeatures.add(physicalFeature);
    }

    public void removePhysicalFeature(String physicalFeature) {
        physicalFeatures.remove(physicalFeature);
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }
}
