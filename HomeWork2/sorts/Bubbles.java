package HomeWork2.sorts;

//Отсортировать массив, заполненный случайными числами, по возрастанию. Для сортировки использовать метод «пузырька».
// Вывести на экран массив в исходном и отсортированном виде.

import HomeWork2.utils.ArraysUtils;
import java.util.Arrays;

public class Bubbles {
    public static void bubblesSort (String[] args) {
        int[] arr = ArraysUtils.arrayRandom(5, 35);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
        }
        for (int i : arr) {
        System.out.print(i + "  ");
        }
    }
}