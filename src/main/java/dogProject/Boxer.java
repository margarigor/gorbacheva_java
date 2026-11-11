package dogProject;

public class Boxer extends Dog {


    @Override
    public void bark() {
        System.out.println("Боксер " + name + " делает Гаф");
    }

    @Override
    public void run() {
        System.out.println("Боксер редко бегает");
    }

    @Override
    public void play() {
        System.out.println("Боксер " + name + " рычит, когда играется");
    }
}
