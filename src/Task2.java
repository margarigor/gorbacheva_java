import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String b = scanner.nextLine();

        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }

}
