package home_work_7;

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
        int index = text.indexOf(word);
        if (((text.indexOf("-", index - 1) == -1) || index == 0) && (text.indexOf("-", index + word.length()) == -1) || index == text.length() - 1) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
            Matcher matcher = pattern.matcher(text);
            return matcher.results().count();
        }
        return 0;
    }
}