package HomeWork2.arrays;

//  во всех методах можно использовать только do....while

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void allElements(int[] arr) {     // // Вывод в консоль всех элементов массива
        int i = 0;
        do {
            System.out.print(arr[i] + "  ");
            i++;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {    // Вывод в консоль каждый второй элемент массива
        int i = 0;
        do {
            i++;
            System.out.print(arr[i] + "  ");
            i++;
        } while (i < arr.length - 1);
        System.out.println();
    }

    @Override
    public void reversElements(int[] arr) {       // Вывод в консоль всех элементов массива в обратном порядке
        int i = arr.length;
        do {
            System.out.print(arr[i - 1] + "  "); //-
            i--;
        } while (i > 0);
        System.out.println();
    }
}
