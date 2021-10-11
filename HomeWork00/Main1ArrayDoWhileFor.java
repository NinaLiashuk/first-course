package HomeWork2.arrays;

// Вывод в консоль всех элементов массива с помощью циклов do....while, while, for, foreach

import HomeWork2.utils.ArraysUtils;

public class Main1ArrayDoWhileFor {
    public static void main(String[] args) {
        int[] container1 = ArraysUtils.arrayFromConsole();
        int i = 0;

        do {
            System.out.print(container1[i] + "  ");
            i++;
        } while (i < container1.length);
        System.out.println();

        i = 0;
        while (i < container1.length) {
            System.out.print(container1[i] + "  ");
            i++;
        }
        System.out.println();

        for (int j = 0; j < container1.length; j++) {
             System.out.print(container1[j] + "  ");
        }
        System.out.println();
        for (int a: container1) {
            System.out.print(a + "  ");
        }
    }
}


