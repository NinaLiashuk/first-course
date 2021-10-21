package HomeWork6.runners;

import HomeWork6.EasySearch;
import HomeWork6.api.ISearchEngine;

// C:\Users\JD1\WarAndPease.txt
public class EasySearchMain {

    public static void main(String[] args){
        ISearchEngine iSearchEngine = new EasySearch();
        System.out.print("Слово 'война' ");
        iSearchEngine.search("", "война");         // 48
        System.out.print("Слово 'и' ");
        iSearchEngine.search("", "и");             // 14575
        System.out.print("Слово 'мир' ");
        iSearchEngine.search("", "мир");           // 31

       }
    }
