package HomeWork2.arrays;

  // во всех методах можно использовать только foreach

public class ForEachOperation implements IArraysOperation {
    @Override
    public void allElements(int[] arr) {              // Вывод в консоль всех элементов массива
        for (int a : arr) {
            System.out.print(a + "  ");
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {        // Вывод в консоль каждый второй элемент массива
        int k = 0;
        for (int a : arr) {
            if (k % 2 != 0) {
                System.out.print(a + "  ");
            }
            k++;
        }
        System.out.println();
    }

    @Override
    public void reversElements(int[] arr) {           // Вывод в консоль всех элементов массива в обратном порядке
        int k = arr.length;
        for (int a : arr) {
            System.out.print(arr[k-1] + "  ");
            k--;
        }
        System.out.println();
    }
}
