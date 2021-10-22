package HomeWork6;

import HomeWork6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) throws NumberFormatException{
        String result = text.replaceAll("(\\p{Punct}|\\p{Space}|\\p{Graph}){1,}", " ");
        return this.iSearchEngine.search(result,word);
    }
}
