package dogProject;

public class Husky extends Dog {
    @Override
    public void bark() {
        System.out.println("Хаски воет");
    }

    @Override
    public void run() {
        System.out.println("Спустишь хаски с поводка - не поймаешь");
    }

    @Override
    public void play() {
        System.out.println("Хаски бесится");
    }
}
