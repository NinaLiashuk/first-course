package HomeWork2.arrays;
//Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
// Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода
//        2.2.1. Вывести все элементы в консоль.
//        2.2.2. Вывести каждый второй элемент массива в консоль.
//        2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import HomeWork00.ArrayFromConsole;
import HomeWork2.utils.ArraysUtils;

public class DoWhileForMethods {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        allElements(array);
        everySecondElement(array);
        reversElements(array);
    }
        public static void allElements (int[] arr) {
            for (int i : arr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        public static void everySecondElement (int[] arr) {
            for (int j = 0; j < arr.length - 1; j++) {
                j++;
                System.out.print(arr[j] + "  ");
            }
            System.out.println();
        }

        public static void reversElements (int[] arr) {
            int n = arr.length;
            while (n > 0) {
                System.out.print(arr[n - 1] + "  ");
                n--;
            }
            System.out.println();
        }
    }



