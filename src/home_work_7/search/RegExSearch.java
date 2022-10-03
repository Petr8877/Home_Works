package home_work_7.search;

import home_work_7.Util.Util;
import home_work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    /**
     * Возвращает информацию о количестве раз которое встречается слово в тексте
     *
     * @param text Текст в котором ищем
     * @param word Слово котовое ищем
     * @return возвращает количество раз которое встречается слово (тип long)
     */

    @Override
    public long search(String text, String word) {
        String clearText = Util.onlyWords(Util.convertToString(text));
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
        Matcher matcher = pattern.matcher(clearText);
        return matcher.results().count();
    }
}