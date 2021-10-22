package HomeWork6.runners;

import HomeWork6.EasySearch;
import HomeWork6.MethodGetName;
import HomeWork6.api.ISearchEngine;

public class EasySearchMain {

    public static void main(String[] args){
        MethodGetName methodGetName = new MethodGetName();
        String text = methodGetName.readFile("WarAndPease.txt"); //.toLowerCase(Locale.ROOT);
        ISearchEngine iSearchEngine = new EasySearch();

        long result = iSearchEngine.search(text, "война");        // 45        48
        System.out.println(result);
        long result1 = iSearchEngine.search(text, "и");           // 13873     14576
        System.out.println(result1);
        long result2 = iSearchEngine.search(text, "мир");         // 31        31
        System.out.println(result2);
    }
}
