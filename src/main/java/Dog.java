import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Dog {

    Random random = new Random();

    public List<String> names = Arrays.asList("Bobby", "Max", "Bella", "Charlie",
            "Luna", "Cooper", "Daisy", "Milo", "Lucy", "Rocky", "Sadie",
            "Teddy", "Bailey", "Buddy", "Lola", "Oliver");

    protected String name = names.get(random.nextInt(names.size()));
    protected int age = random.nextInt(10) + 1;


    public abstract void bark();

    public abstract void run();

    public abstract void play();

    public void getRandomAction() {
        int ranNum = random.nextInt(3);
        switch (ranNum) {
            case 0:
                bark();
                break;
            case 1:
                run();
                break;
            case 2:
                play();
                break;
        }

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + ": " + name + ", " + age + "\n");
    }
}
