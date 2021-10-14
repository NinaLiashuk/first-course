package HomeWork5;

import java.io.*;
import java.util.*;

// метод для вывода рандомного имени, загруженного из файла names2.txt

public class MethodReaderName {

    public static String nameFromFile () throws FileNotFoundException {

        File names = new File("names2.txt");
        Scanner scanner = new Scanner(names);
        String line = scanner.nextLine();
        String[] studentNames = line.split(" ");
        scanner.close();

        Random random = new Random();
        int randomName = random.nextInt(studentNames.length);
        return studentNames[randomName];
    }
}

