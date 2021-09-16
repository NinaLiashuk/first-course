package HomeWork2.Arrays;

// Вывод в консоль каждый второй элемент массива с помощью циклов do....while, while, for, foreach

public class Main2ArrayDoWhileFor {
    public static void main(String[] args) {
        int[] container1 = ArraysUtils2_2_1.arrayFromConsole();
        int i = 0;

        do {
            i++;
            System.out.print(container1[i] + "  ");
            i++;
        }
        while (i < container1.length - 1);
        System.out.println();

        i = 0;
        while (i < container1.length - 1) {
            i++;
            System.out.print((container1[i]) + "  ");
            i++;
        }
        System.out.println();

        for (int j = 0; j < container1.length - 1; j++) {
            j++;
            System.out.print(container1[j] + "  ");
        }
        System.out.println();

        int k = 0;
        for (int a : container1) {
            if (k % 2 != 0) {
                System.out.print(a + "  ");
            }
            k++;
        }
    }
}
// Сделано

