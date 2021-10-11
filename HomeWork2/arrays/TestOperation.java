package HomeWork2.arrays;

import HomeWork2.arrays.DoWhileOperation;
import HomeWork2.arrays.ForEachOperation;
import HomeWork2.arrays.ForOperation;
import HomeWork2.arrays.WhileOperation;
import HomeWork2.utils.ArraysUtils;

public class TestOperation {
    public static void main(String[] args) {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        int[] array = ArraysUtils.arrayFromConsole();
        doWhileOperation.allElements(array);
        doWhileOperation.everySecondElement(array);
        doWhileOperation.reversElements(array);

        WhileOperation whileOperation = new WhileOperation();
        whileOperation.allElements(array);
        whileOperation.everySecondElement(array);
        whileOperation.reversElements(array);

        ForOperation forOperation = new ForOperation();
        forOperation.allElements(array);
        forOperation.everySecondElement(array);
        forOperation.reversElements(array);

        ForEachOperation forEachOperation = new ForEachOperation();
        forEachOperation.allElements(array);
        forEachOperation.everySecondElement(array);
        forEachOperation.reversElements(array);


    }
}
