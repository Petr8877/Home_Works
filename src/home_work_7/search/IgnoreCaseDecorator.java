package home_work_7.search;

import home_work_7.api.ISearchEngine;

public class IgnoreCaseDecorator implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public IgnoreCaseDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Возвращает информацию о количестве раз которое встречается слово в тексте
     *
     * @param text Текст в котором ищем
     * @param word Слово котовое ищем
     * @return возвращает количество раз которое встречается слово (тип long)
     */

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return searchEngine.search(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }
}
