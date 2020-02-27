import java.util.ArrayList;

public class BirdWatcher {
    private ArrayList<Birds> birds;

    public BirdWatcher() {
        birds = new ArrayList<Birds>();
    }

    public void add(Birds newBird) {
        birds.add(newBird);
    }

    public void observation(String birdName) {
        boolean found = false;
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(birdName)) {
                birds.get(i).incrementObservation(birds.get(i));
                found = true;

            }
        }
        if(!found){
            System.out.println("Is not a bird!");
        }


    }

    public void statistics() {
        for (Birds bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(String birdName) {
        for (Birds bird : birds) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

}
