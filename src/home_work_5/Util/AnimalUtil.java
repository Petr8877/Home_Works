package home_work_5.Util;

import java.util.*;

public class AnimalUtil {

    private static final List<String> libraryNick = new ArrayList<>(Arrays.asList("Боня", "Тузик", "Ронни", "Умка", "Лилу", "Честер",
            "Филя", "Моцарт", "Ева", "Мэйбл", "Луна", "Френки", "Оззи",
            "Джина", "Бобик", "Джек", "Шарик", "Дружок", "Пес"));

    /**
     * createRandomNick генерирует случайный Nick
     *
     * @return возвращает случайный Nick (тип String)
     */
    public static String createRandomNick() {
        String librarySymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        return Util.createRandom(librarySymbol);
    }

    /**
     * createRandomRusNick генерирует случайный Nick из русских букв
     *
     * @return возвращает случайный Nick из русских букв (тип String)
     */
    public static String createRandomRusNick() {
        String libraryRusSymbol = "йфяцычувскамепинртгоьшлбщдюзжхэъёЙФЯЦЫЧУВСКАМЕПИНРТГОЬШЛБЩДЮЗЖЭХЪЁ";
        return Util.createRandom(libraryRusSymbol);
    }

    /**
     * createRandomRealNick генерирует случайный Nick
     *
     * @return возвращает случайный Nick из коллекции libraryNick (тип String)
     */
    public static String createRandomRealNick() {
        return Util.createRandomReal(libraryNick);
    }

    /**
     * createRandomNickFromFile генерирует случайный Nick
     *
     * @return возвращает случайный Nick из файла Nick.rtf (тип String)
     */
    public static String createRandomNickFromFile() {
        return Util.createRandomFromFile("Nick.rtf");
    }

    /**
     * createAnimalAge генерирует случайное значение
     *
     * @return возвращает случайное значение от 1 до 15 (тип int)
     */
    public static int createRandomAge() {
        Random random = new Random();
        return 1 + random.nextInt(14);
    }

    /**
     * checkAge выполняет проверку на вхождение переданного аргумента в диапозон от 1 до 15,
     * при выходе за рамки диапазона уменьшает или увеличивает переданный аргумент
     *
     * @param age входящий аргумент (тип int)
     * @return возвращает значение входящие в диапозон от 1 до 15
     */
    public static int checkAge(int age) {
        int maxAge = 15;
        int minAge = 1;
        if (age > maxAge) {
            int count = age - maxAge;
            System.out.println("Введенный возраст слишком велик. Возраст уменьшен на " + count + ".");
            return maxAge;
        } else if (age < minAge) {
            int count = minAge - age;
            System.out.println("Введенный возвраст слишком мал. Возраст увеличин на " + count + ".");
            return minAge;
        } else {
            return age;
        }
    }
}
