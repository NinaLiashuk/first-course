package HomeWork2.Arrays;

import java.util.Arrays;

public class ArrayRandom2_2_4 {
    public static void main(String[] args) {
// Сумма четных положительных элементов массива
        int[] container = ArraysUtils2_2_1.arrayRandom(5, 15);
        int sum = 0;
        System.out.println(Arrays.toString(container));
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= 0 && container[i] % 2 == 0) {
                sum += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива = " + sum);  //Сделано
        System.out.println();

//Максимальный из элементов массива с четными индексами
        int[] container1 = ArraysUtils2_2_1.arrayRandom(8, 80);
        System.out.println(Arrays.toString(container1));
        int max = 0;
        for (int i = 0; i < container1.length; i += 2) {
            if (container1[i] > container1[max] && container1[i] % 2 == 0) {
                container1[max] = container1[i];
            }
        }
        System.out.println("Максимальный элемент с четным индексом : " + container1[max]); //Сделано
        System.out.println();

  // Элементы массива, которые меньше среднего арифметического
        int[] container2 = ArraysUtils2_2_1.arrayRandom(7, 50);
        System.out.println(Arrays.toString(container2));
        int sum2 = 0;
        for (int i = 0; i < container2.length; i++) {
            sum2 += container2[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum2);
        int result = sum2 / container2.length;
        System.out.println("Среднее арифметическое = " + result);
        System.out.print("Элементы, меньше среднего арифметического : ");
        for (int i = 0; i < container2.length; i++) {
            if (container2[i] < result) {
                System.out.print(container2[i] + "  "); //Сделано
            }
        }
        System.out.println();
        System.out.println();

        //Найти два наименьших (минимальных) элемента массива
        int[] container3 = ArraysUtils2_2_1.arrayRandom(7, 30);
        System.out.println(Arrays.toString(container3));
        int b;
        for (int i = 0; i < container3.length; i++) {
            for (int j = 0; j < (container3.length - i - 1); j++) {
                if (container3[j] > container3[j + 1]) {
                    b = container3[j];
                    container3[j] = container3[j + 1];
                    container3[j + 1] = b;
                }
            }
        }
        for (int i = 0; i < container3.length; i++) {
            System.out.print(container3[i] + "  ");// Распечатала массив от минимального к максимальному числу
        }
        System.out.println("Минимальные числа в массиве: " + container3[0] + "  " + container3[1]);
        System.out.println();

        //Сжать массив, удалив элементы, принадлежащие интервалу
        int[] container4 = ArraysUtils2_2_1.arrayRandom(7, 30);
        System.out.println(Arrays.toString(container4));
        // Будем удалять элементы, попадающие в интервал от 15 до 25
        int j;
        int length = container4.length;
        for (int i = 0; i < container4.length; ) {
            if (container4[i] >= 15 && container4[i] <= 25) {
                length--;
                for (j = i; j < length; j++) {
                    container4[j] = container4[j + 1];
                }
                container4[j] = 0;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(container4));
        System.out.println();

        //Сумма цифр массива
        int[] container5 = ArraysUtils2_2_1.arrayRandom(7, 212);
        System.out.println(Arrays.toString(container5));
        int y;
        int sumy = 0;
        int suma = 0;
        for (int a : container5) {
            if (a % 10 == a) {
                    System.out.print(a + " ; ");
                }
            else {
                while (a >=10 ) {
                    y = a % 10;
                    a = a / 10;
                    System.out.print(y + " ; ");
                    sumy += y;
                }
                System.out.print(a + " ; ");
            }
            suma += a;
        }
        System.out.println("Сумма всех цифр массива = " + (suma + sumy));   //Сделано
    }
}



