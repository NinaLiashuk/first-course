package HomeWork6;

import java.io.IOException;
import java.util.*;

public class WarAndPeace {

    public static void main(String[] args) throws IOException {

        MethodGetName getName = new MethodGetName();
        String text = getName.readFile("WarAndPease");

        System.out.println("Количество всех символов = " + text.length());
        String[] words = text.replaceAll("(\\p{Punct}|\\p{Space}|\\p{Graph}){1,}", " ").split(" ");
      //  String[] words = text.split("\\s*(«|\\s|,|;|:|\n|!|\\?|»|\\(|\\)|\\.)\\s*");
        System.out.println("Количество всех слов в книге: " + words.length);

        Set mySet = new HashSet();
        Collections.addAll(mySet, words);
        System.out.println("Количество уникальных слов в книге: " + mySet.size());

        List<String> list = new ArrayList();
        Collections.addAll(list, words);

        Map<String, Integer> anyWord = new HashMap<String, Integer>();
            for (String o : list) {
                int count = anyWord.containsKey(o) ? anyWord.get(o) : 0;
                anyWord.put(o, count + 1);
            }

        System.out.println("Слово 'война' встречается " + anyWord.get("война") + " раз");    // 46
        System.out.println("Слово 'и' встречается " + anyWord.get("и") + " раз");            // 13875
        System.out.println("Слово 'мир' встречается " + anyWord.get("мир") + " раз");        // 32

        List list3 = new ArrayList(anyWord.entrySet());
        Collections.sort(list3, new WordsComparator());
        System.out.println("Топ 10 самых используемых слов");
        for (int i = 0; i < 10; i++) {
            System.out.println(list3.get(i));
        }
    }
}
