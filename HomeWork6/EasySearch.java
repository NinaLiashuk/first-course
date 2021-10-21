package HomeWork6;

import HomeWork6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word){
        try {
            text = new String(Files.readAllBytes(Paths.get("Akula.txt")));
            text = text.toLowerCase(Locale.ROOT);
        } catch (IOException e) {
            throw new RuntimeException("Некорректное чтение файла", e);
        }
        int count = 0;
        int value;
        int previousValue = 0;
        String[] char5 = new String[]{" ", ",", ".", ";", ":", "!", "?", "«", "(", ")","»", "\n"};

        do {
            value = text.indexOf(word, previousValue);
            if (value < 0) {
                break;
            } else if (value == 0){
                previousValue = value + word.length();
                String symbol = String.valueOf(text.charAt(previousValue));
                for (String s : char5) {
                    if (symbol.equals(s)) {
                        count++;
                    //    System.out.println(word + " : индекс входа " + value);
                    }
                }
            } else if (value >0) {
                previousValue = value - 1;
                String symbol = String.valueOf(text.charAt(previousValue));
                for (String s : char5) {
                    if (symbol.equals(s)) {
                        previousValue = value + word.length();
                        String symbol2 = String.valueOf(text.charAt(previousValue));

                        for (String ss : char5) {
                            if (symbol2.equals(ss)) {
                                count++;
                            //    System.out.println(word + " : индекс входа " + value);
                                break;
                            }
                        }
                        break;
                    }
                }
                previousValue = value + 1;
            }
        } while (value < text.length()) ;
    return count;
    }
}
