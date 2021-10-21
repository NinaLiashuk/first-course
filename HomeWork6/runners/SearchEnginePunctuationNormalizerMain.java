package HomeWork6.runners;

import HomeWork6.SearchEnginePunctuationNormalizer;
import HomeWork6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class SearchEnginePunctuationNormalizerMain {

    public static void main(String[] args) {
        SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer();
        searchEnginePunctuationNormalizer.search("","");
    }
}
