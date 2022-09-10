package home_work_7;

public class EasySearch implements ISearchEngine {

    /**
     * Возвращает информацию о количестве раз которое встречается слово в тексте
     *
     * @param text Текст в котором ищем
     * @param word Слово котовое ищем
     * @return возвращает количество раз которое встречается слово (тип long)
     */

    @Override
    public long search(String text, String word) {
        long counter = 0;
        int indexFromSearch = 0;
        int indexOf = text.indexOf(word, indexFromSearch);
        while (indexOf != -1) {
            if (checkCharBeforeWordIsIllegible(indexOf, text) && checkCharAfterWordIsEligible(indexOf, text, word.length())) {
                counter++;
            }
            indexFromSearch = indexOf + word.length();
            indexOf = text.indexOf(word, indexFromSearch);
        }
        return counter;
    }

    private boolean checkCharAfterWordIsEligible(int indexOf, String text, int length) {
        if (text.length() == indexOf + length) {
            return true;
        }
        char charAfterWord = text.charAt(indexOf + length);
        return !(charAfterWord >= 1040 && charAfterWord <= 1103) && !(charAfterWord >= 48 && charAfterWord <= 57) && charAfterWord != 45;
    }

    private boolean checkCharBeforeWordIsIllegible(int indexOf, String text) {
        if (indexOf == 0) {
            return true;
        }
        char charBeforeWord = text.charAt(indexOf - 1);
        return !(charBeforeWord >= 1040 && charBeforeWord <= 1103) && !(charBeforeWord >= 48 && charBeforeWord <= 57) && charBeforeWord != 45;
    }


}
