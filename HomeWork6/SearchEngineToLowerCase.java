package HomeWork6;

import HomeWork6.api.ISearchEngine;

import java.util.Locale;

public class SearchEngineToLowerCase implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public SearchEngineToLowerCase(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        String string = text.toLowerCase(Locale.ROOT);
        return this.iSearchEngine.search(text.toLowerCase(Locale.ROOT),word);
    }
}