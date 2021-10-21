package HomeWork6;

import HomeWork6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

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
        String result = text.replaceAll("\\p{Punct}", "");
        String result2 = result.replaceAll("\\s*(\\s|\n|,|!|«|»|:|;|—|\\.)\\s", " ");
        return Long.parseLong(result2);
    }
}
