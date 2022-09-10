package home_work_7;

public class Main {

    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        IgnoreCaseDecorator ignore = new IgnoreCaseDecorator(easySearch);

        System.out.println("Как часто встречается слово \"война\" с учетом регистра");
        System.out.println(easySearch.search("src/home_work_6/WarAndPeace.txt", "война"));

        System.out.println("Как часто встречается слово \"война\" без учета регистра");
        System.out.println(ignore.search("src/home_work_6/WarAndPeace.txt", "война"));

        System.out.println("Как часто встречается слово \"и\" с учетом регистра");
        System.out.println(easySearch.search("src/home_work_6/WarAndPeace.txt", "и"));

        System.out.println("Как часто встречается слово \"и\" без учета регистра");
        System.out.println(ignore.search("src/home_work_6/WarAndPeace.txt", "и"));

        System.out.println("Как часто встречается слово \"мир\" с учетом регистра");
        System.out.println(easySearch.search("src/home_work_6/WarAndPeace.txt", "мир"));

        System.out.println("Как часто встречается слово \"мир\" без учета регистра");
        System.out.println(ignore.search("src/home_work_6/WarAndPeace.txt", "мир"));
    }
}
