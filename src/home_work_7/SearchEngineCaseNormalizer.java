package home_work_7;

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
     * @param text        Текст в котором ищем
     * @param word        Слово котовое ищем
     * @param declination Склонение переданного для поиска слова
     * @return возвращает количество раз которое встречается слово (тип long)
     */
    public long searchCaseNormalizer(String text, String word, int declination) {
        long result;
        char[] tmp = word.toCharArray();
        if (declination == 1) {
            StringBuilder builder = new StringBuilder();
            if (tmp[word.length() - 1] == 'a' || tmp[word.length() - 1] == 'я' || tmp[word.length() - 1] == 'ы' || tmp[word.length() - 1] == 'и'
                    || tmp[word.length() - 1] == 'е' || tmp[word.length() - 1] == 'у' || tmp[word.length() - 1] == 'ю') {
                for (int i = 0; i < word.length() - 1; i++) {
                    builder.append(tmp[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    builder.append(tmp[i]);
                }
            }
            String str1 = builder + "а";
            String str2 = builder + "я";
            String str3 = builder + "ы";
            String str4 = builder + "и";
            String str5 = builder + "е";
            String str6 = builder + "у";
            String str7 = builder + "ю";
            String str8 = builder + "ой";
            String str9 = builder + "ей";
            long pad1 = search(text, str1);
            long pad2 = search(text, str2);
            long pad3 = search(text, str3);
            long pad4 = search(text, str4);
            long pad5 = search(text, str5);
            long pad6 = search(text, str6);
            long pad7 = search(text, str7);
            long pad8 = search(text, str8);
            long pad9 = search(text, str9);
            result = pad1 + pad2 + pad3 + pad4 + pad5 + pad6 + pad7 + pad8 + pad9;
            return result;
        } else if (declination == 2) {
            StringBuilder builder = new StringBuilder();
            Set<Character> set1 = Stream.of('ф', 'ч', 'с', 'к', 'м', 'п', 'н', 'р', 'т', 'г', 'ш', 'л', 'б', 'д', 'щ', 'з', 'ж', 'х', 'ъ', 'ь').collect(Collectors.toSet());
            Set<Character> set2 = Stream.of('о', 'е', 'а', 'я', 'у', 'ю', 'и').collect(Collectors.toSet());
            char[] wordToSymbols = word.toCharArray();
            char lastSymbol = wordToSymbols[word.length() - 1];
            if (set1.contains(lastSymbol)) {
                builder.append(word);
            } else if (set2.contains(lastSymbol)) {
                for (int i = 0; i < word.length() - 1; i++) {
                    builder.append(wordToSymbols[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    builder.append(wordToSymbols[i]);
                }
            }
            String str1 = builder.toString();
            String str2 = builder + "о";
            String str3 = builder + "е";
            String str4 = builder + "а";
            String str5 = builder + "я";
            String str6 = builder + "у";
            String str7 = builder + "ю";
            String str8 = builder + "ом";
            String str9 = builder + "ем";
            String str10 = builder + "и";
            long pad1 = search(text, str1);
            long pad2 = search(text, str2);
            long pad3 = search(text, str3);
            long pad4 = search(text, str4);
            long pad5 = search(text, str5);
            long pad6 = search(text, str6);
            long pad7 = search(text, str7);
            long pad8 = search(text, str8);
            long pad9 = search(text, str9);
            long pad10 = search(text, str10);
            result = pad1 + pad2 + pad3 + pad4 + pad5 + pad6 + pad7 + pad8 + pad9 + pad10;
            return result;
        } else {
            StringBuilder builder = new StringBuilder();
            char[] wordToChar = word.toCharArray();
            char lastSymbol = wordToChar[word.length() - 1];
            if (lastSymbol == 'ь' || lastSymbol == 'и') {
                for (int i = 0; i < word.length() - 1; i++) {
                    builder.append(wordToChar[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    builder.append(wordToChar[i]);
                }
            }
            String str1 = builder + "ь";
            String str2 = builder + "и";
            String str3 = builder + "ью";
            long pad1 = search(text, str1);
            long pad2 = search(text, str2);
            long pad3 = search(text, str3);
            result = pad1 + pad2 + pad3;
            return result;
        }
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
