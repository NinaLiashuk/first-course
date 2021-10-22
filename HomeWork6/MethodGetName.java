package HomeWork6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodGetName {

    public String readFile(String filePath) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("WarAndPease.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException("Некорректное чтение файла", e);
        }
    }
}
