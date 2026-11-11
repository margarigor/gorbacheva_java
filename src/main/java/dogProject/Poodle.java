package dogProject;

public class Poodle extends Dog {
    @Override
    public void bark() {
        System.out.println("Пудель " + name + " тяфкает");
    }

    @Override
    public void run() {
        System.out.println("Пудель " + name + " бегает в припрыжку");
    }

    @Override
    public void play() {
        System.out.println("Для игры с пуделем  нужен мячик");
    }
}
