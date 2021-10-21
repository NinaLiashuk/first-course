package HomeWork6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WarAndPeace {

    public static void main(String[] args) throws IOException {

        List myList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("WarAndPease.txt"));) {
            while (bufferedReader.ready()) {
                myList.add(bufferedReader.readLine());
            }
        } catch (IOException e){
            throw new RuntimeException("Некорректное чтение файла", e);
        }
        for (Object o : myList) {
            stringBuilder.append(o.toString());
        }
        String allString = stringBuilder.toString();
        System.out.println("Все символы = " + allString.length());
        String[] words = allString.split("\\s*(«|\\s|,|;|:|\n|!|\\?|»|\\(|\\)|\\.)\\s*");
        System.out.println("Количество всех слов в книге: " + words.length);

        Set mySet = new HashSet();
        Collections.addAll(mySet, words);
        System.out.println("Количество уникальных слов в книге: " + mySet.size());

        List<String> list = new ArrayList();
        Collections.addAll(list, words);

        Map<String, Integer> anyWord = new HashMap<String, Integer>();
            for (String o : list) {
                o = o.toLowerCase(Locale.ROOT);
                int count = anyWord.containsKey(o) ? anyWord.get(o) : 0;
                anyWord.put(o, count + 1);
            }

        System.out.println("Слово 'война' встречается " + anyWord.get("война") + " раз");    // 48
        System.out.println("Слово 'и' встречается " + anyWord.get("и") + " раз");            // 14576
        System.out.println("Слово 'мир' встречается " + anyWord.get("мир") + " раз");        // 31

        List list3 = new ArrayList(anyWord.entrySet());
        Collections.sort(list3, new WordsComparator());
        System.out.println("Топ 10 самых используемых слов");
        for (int i = 0; i < 10; i++) {
            System.out.println(list3.get(i));
        }
    }
}
