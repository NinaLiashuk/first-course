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
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь и имя файла");
            String path = scanner.nextLine();
            text = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            throw new RuntimeException("Некорректное чтение файла", e);
        }
        
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);           // Поиск с учетом регистра
      //  Matcher matcher = pattern.matcher(text.toLowerCase(Locale.ROOT));
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}

