package HomeWork5;

import java.util.Arrays;
import java.util.Random;
import java.lang.String;

public class MethodStringName {

    public static String stringName() {
        Random random = new Random();
        var list1 = Arrays.asList("С", "В", "Д", "М", "К", "Р", "Л", "И");
        var list2 = Arrays.asList("а", "е", "и", "о", "у", "я", "а");
        var list3 = Arrays.asList("б", "г", "д", "з", "л", "","ф", "п", "х", "т", "", "", "");
        int index;
        String result;
        index = random.nextInt(list1.size());
        var randomLetter1 = list1.get(index);
        result = randomLetter1;

        for (int i = 0; i < 2; i++) {
            index = random.nextInt(list2.size());
            var randomLetter2 = list2.get(index);
            result += randomLetter2;

            index = random.nextInt(list2.size());
            var randomLetter3 = list3.get(index);
            result += randomLetter3;
        }
        return result;
    }
}







