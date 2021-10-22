package HomeWork6;

import HomeWork6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        System.out.print("Посчет слова из класса RegExSearch: " + word + " = ");
        String redex = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(redex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        long count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}

