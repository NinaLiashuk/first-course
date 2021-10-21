package HomeWork6;

import HomeWork6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class SearchEngineToLowerCase implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь и имя файла");
        String path = scanner.nextLine();
        try {
            text = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            throw new RuntimeException("Некорректное чтение файла", e);
        }
        return Long.parseLong(text.toLowerCase(Locale.ROOT), 10);
    }

    public static void main(String[] args) throws NumberFormatException{
        ISearchEngine iSearchEngine = new SearchEngineToLowerCase();
        iSearchEngine.search("", "");
    }
}