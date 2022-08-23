package home_work_5.Util;

import java.util.*;

public class PersonUtil {

    private static final List<String> libraryName = new ArrayList<>(Arrays.asList("Петя", "Коля", "Гриша", "Маша", "Саша", "Илья",
            "Егор", "Паша", "Никита", "Гога", "Гиви", "Глеб", "Степа",
            "Дима", "Ашот", "Кирилл", "Надя", "Таня", "Света"));

    private static final String librarySymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

    /**
     * createRandomName создает случайное имя
     *
     * @return случайное имя (тип String)
     */
    public static String createRandomName() {
        return Util.createRandom(librarySymbol);
    }

    /**
     * createRandomRusName создает случайное имя используя только русские буквы
     *
     * @return случайное имя (тип String)
     */
    public static String createRandomRusName() {
        String libraryRusSymbol = "йфяцычувскамепинртгоьшлбщдюзжхэъёЙФЯЦЫЧУВСКАМЕПИНРТГОЬШЛБЩДЮЗЖЭХЪЁ";
        return Util.createRandom(libraryRusSymbol);
    }

    /**
     * createRandomRealName создает случайное имя используя реальные имена
     *
     * @return случайное имя (тип String)
     */
    public static String createRandomRealName() {
        return Util.createRandomReal(libraryName);
    }

    /**
     * createRandomNameFromFile создает случайное имя используя данные из файла
     *
     * @return случайное имя (тип String)
     */
    public static String createRandomNameFromFile() {
        return Util.createRandomFromFile("Name.rtf");
    }

    /**
     * createPassword создает случайное пароль (набор символов)
     *
     * @return случайное пароль (тип String)
     */
    public static String createPassword() {
        Random random = new Random();
        int passwordLength = 5 + random.nextInt(5);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int symbolIndex = (int) (librarySymbol.length() * Math.random());
            builder.append(librarySymbol.charAt(symbolIndex));
        }
        return builder.toString();
    }

    /**
     * checkPassword проверяет переданную строку на вхождение длинны строки в диапозон от 5 до 15
     *
     * @param password переданная строка
     * @return возвращает строку с длинной строки входящую в диапазон от 5 до 15
     */
    public static String checkPassword(String password) {
        int length = password.length();
        if (length > 10) {
            int count = length - 10;
            System.out.println("Введенный пароль слишком велим. Последние " + count + " символа удалены.");
            return password.substring(0, 9);
        } else if (length < 5) {
            int count = 5 - length;
            String builder = password +
                    "0".repeat(count);
            System.out.println("Введенный пароль слишком мал. В конце добавлены " + count + " 0.");
            return builder;
        } else {
            return password;
        }
    }

    /**
     * createRandomNick генерирует случайный Nick
     *
     * @return возвращает случайный Nick (тип String)
     */
    public static String createRandomNick() {
        return Util.createRandom(librarySymbol);
    }

    /**
     * createRandomEngNick генерирует случайный Nick используя только английские буквы
     *
     * @return возвращает случайный Nick (тип String)
     */
    public static String createRandomEngNick() {
        String libraryEngSymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        return Util.createRandom(libraryEngSymbol);
    }

    /**
     * createRandomNickFromFile генерирует случайный Nick используя данные из файла
     *
     * @return возвращает случайный Nick (тип String)
     */
    public static String createRandomNickFromFile() {
        return Util.createRandomFromFile("NickPerson.rtf");
    }

}
