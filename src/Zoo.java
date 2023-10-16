import java.util.HashSet;
import java.util.Objects;

public class Zoo {
    private final HashSet<Fish> aquarium;
    private final HashSet<Bird> aviary;
    private final HashSet<Reptile> herpetarium;
    private final HashSet<Mammal> pen;

    public Zoo() {
        aquarium = new HashSet<>();
        aviary = new HashSet<>();
        herpetarium = new HashSet<>();
        pen = new HashSet<>();
    }
    public void addAquarium(Fish fish) {
        aquarium.add(fish);
    }

    public void addAviary(Bird bird) {
        aviary.add(bird);
    }

    public void addHerpetarium(Reptile reptile) {
        herpetarium.add(reptile);
    }

    public void addPen(Mammal mammal) {
        pen.add(mammal);
    }

    public HashSet<Fish> getAllFish() {
        return aquarium;
    }

    public HashSet<Bird> getAllBirds() {
        return aviary;
    }

    public HashSet<Reptile> getAllReptiles() {
        return herpetarium;
    }

    public HashSet<Mammal> getAllMammals() {
        return pen;
    }

    public Animal getOneFish(String name) {

        return aquarium.stream()
                    .filter(fish -> Objects.equals(fish.getName(), name))
                    .findFirst()
                    .orElse(null);
    }

    public Animal getOneBird(String name) {

        return aviary.stream()
                .filter(bird -> Objects.equals(bird.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public Animal getOneMammal(String name) {

        return pen.stream()
                .filter(mammal -> Objects.equals(mammal.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public Animal getOneReptile(String name) {

        return herpetarium.stream()
                .filter(reptile -> Objects.equals(reptile.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public void remove(Animal animal, String name) {
        if (animal instanceof Bird) {
            aviary.remove(aviary.stream()
                    .filter(bird -> Objects.equals(bird.getName(), name))
                    .findFirst()
                    .orElse(null));
        } else if (animal instanceof Fish) {
            aquarium.remove(aquarium.stream()
                    .filter(fish -> Objects.equals(fish.getName(), name))
                    .findFirst()
                    .orElse(null));
        } else if (animal instanceof Mammal) {
            pen.remove(pen.stream()
                    .filter(mammal -> Objects.equals(mammal.getName(), name))
                    .findFirst()
                    .orElse(null));
        } else {
            herpetarium.remove(herpetarium.stream()
                    .filter(reptile -> Objects.equals(reptile.getName(), name))
                    .findFirst()
                    .orElse(null));
        }
    }


}
