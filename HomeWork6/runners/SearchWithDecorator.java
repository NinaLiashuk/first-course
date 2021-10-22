package HomeWork6.runners;

import HomeWork6.*;
import HomeWork6.api.ISearchEngine;

public class SearchWithDecorator {

    public static void main(String[] args) {
        MethodGetName getName = new MethodGetName();
        String text = getName.readFile("WarAndPease");
        ISearchEngine iSearchEngine = new SearchEnginePunctuationNormalizer(new SearchEngineToLowerCase(new RegExSearch()));
        long redExResult = iSearchEngine.search(text,"война");         // 52
        System.out.println(redExResult);
        long redExResult1 = iSearchEngine.search(text,"и");            // 14601
        System.out.println(redExResult1);
        long redExResult2 = iSearchEngine.search(text,"мир");          // 32
        System.out.println(redExResult2);

        ISearchEngine iSearchEngine1 = new SearchEnginePunctuationNormalizer(new SearchEngineToLowerCase(new EasySearch()));
        long easySearchResult = iSearchEngine1.search(text,"война");   // 52
        System.out.println(easySearchResult);
        long easySearchResult1 = iSearchEngine1.search(text,"и");      // 14601
        System.out.println(easySearchResult1);
        long easySearchResult2 = iSearchEngine1.search(text,"мир");    // 32
        System.out.println(easySearchResult2);

    }
}
