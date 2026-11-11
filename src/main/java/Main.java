import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            dogs.add(getRandomDog());
        }

        for (int i = 1; i < 366; i++) {
            if (i % 30 == 0) {
                dogs.add(getRandomDog());
            }
            dogs.get(rand.nextInt(dogs.size())).getRandomAction();
        }
        System.out.println(dogs.size());

    }

    public static Dog getRandomDog() {
        Dog tempDog = null;
        switch (rand.nextInt(3)) {
            case 0:
                tempDog = new Boxer();
                break;
            case 1:
                tempDog = new Husky();
                break;
            case 2:
                tempDog = new Poodle();
                break;
        }
        return tempDog;
    }
}
