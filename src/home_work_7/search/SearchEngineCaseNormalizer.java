package home_work_7.search;

import home_work_7.api.ISearchEngine;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Используя search возвращает информацию о количестве раз которое встречается слово в тексте без учета падежей
     *
     * @param text Текст в котором ищем
     * @param word Слово котовое ищем
     * @return возвращает количество раз которое встречается слово (тип long)
     */
    public long searchCaseNormalizer(String text, String word) {
        long result = 0;
        char[] tmp = word.toCharArray();
        String ls = String.valueOf(tmp[tmp.length - 1]);
        Set<String> set1 = Stream.of("ф", "ч", "с", "к", "м", "п", "н", "р", "т", "г", "ш", "л", "б", "д", "щ", "з", "ж", "х", "ъ").collect(Collectors.toSet());
        Set<String> set2 = Stream.of("о", "е", "а", "я", "у", "ю", "и", "ы", "ь").collect(Collectors.toSet());
        Set<String> set3 = Stream.of("ом", "ем", "ой", "ей", "ью", "ов", "ев", "ам", "ям", "ах", "ём", "ях").collect(Collectors.toSet());
        Set<String> set4 = Stream.of("ами", "ями").collect(Collectors.toSet());
        Set<String> generalSet = new HashSet<>();
        generalSet.addAll(set2);
        generalSet.addAll(set3);
        generalSet.addAll(set4);
        StringBuilder builder = new StringBuilder();
        if (set1.contains(ls)) {
            builder.append(word);
            result += search(text, builder.toString());
        } else if (set2.contains(ls)) {
            for (int i = 0; i < word.length() - 1; i++) {
                builder.append(tmp[i]);
            }
        } else if (set3.contains(String.valueOf(tmp[tmp.length - 2] + tmp[tmp.length - 1]))) {
            for (int i = 0; i < word.length() - 2; i++) {
                builder.append(tmp[i]);
            }
        } else if (set4.contains(String.valueOf(tmp[tmp.length - 3] + tmp[tmp.length - 2] + tmp[tmp.length - 1]))) {
            for (int i = 0; i < word.length() - 3; i++) {
                builder.append(tmp[i]);
            }
        }
        for (String s : generalSet) {
            String tmp2 = builder + s;
            result += search(text, tmp2);
        }
        return result;
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
        return searchEngine.search(text, word);
    }
}
