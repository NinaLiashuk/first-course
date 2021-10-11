package HomeWork2.utils;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static int[] arrayFromConsole() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scan.nextInt();
        int[] arr = new int[length];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){

        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt(maxValueExclusion);
        }
    return arr;
    }
}

