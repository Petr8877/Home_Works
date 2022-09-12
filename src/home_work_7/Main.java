package home_work_7;

public class Main {

    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        IgnoreCaseDecorator ignore = new IgnoreCaseDecorator(easySearch);
        String x = Util.convertToString("src/home_work_7/WarAndPeace.txt");

        System.out.println("Как часто встречается слово \"война\" с учетом регистра");
        System.out.println(easySearch.search(x, "война"));

        System.out.println("Как часто встречается слово \"война\" без учета регистра");
        System.out.println(ignore.search(x, "война"));

        System.out.println("Как часто встречается слово \"и\" с учетом регистра");
        System.out.println(easySearch.search(x, "и"));

        System.out.println("Как часто встречается слово \"и\" без учета регистра");
        System.out.println(ignore.search(x, "и"));

        System.out.println("Как часто встречается слово \"мир\" с учетом регистра");
        System.out.println(easySearch.search(x, "мир"));

        System.out.println("Как часто встречается слово \"мир\" без учета регистра");
        System.out.println(ignore.search(x, "мир"));
    }
}
