package HomeWork2.arrays;

// Вывод в консоль всех элементов массива в обратном порядке с помощью циклов do....while, while, for, foreach

import HomeWork2.utils.ArraysUtils;

public class Main3ArrayDoWhileFor {
    public static void main(String[] args) {
        int[] container1 = ArraysUtils.arrayFromConsole();

        int i = container1.length;
        do {
            System.out.print(container1[i - 1] + "  "); //-
            i--;
        } while (i > 0);
        System.out.println();

        int n = container1.length;
        while (n > 0) {
            System.out.print(container1[n - 1] + "  ");
            n--;
        }
        System.out.println();

        for (int j = (container1.length - 1); j >= 0; j--) {    //+
            System.out.print(container1[j] + "  ");
        }
        System.out.println();

        int k = container1.length;
        for (int a : container1) {
            System.out.print(container1[k-1] + "  ");
            k--;
        }
    }
}
