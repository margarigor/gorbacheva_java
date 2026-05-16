public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        int[] array = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Четные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
