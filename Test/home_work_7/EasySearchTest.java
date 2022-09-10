package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EasySearchTest {

    private final EasySearch easySearch = new EasySearch();

    @Test
    public void search1() {
        Assertions.assertEquals(1, easySearch.search("привет,какдела!", "привет"));
    }

    @Test
    public void search2() {
        Assertions.assertEquals(1, easySearch.search("привет;какдела!", "какдела"));
    }

    @Test
    public void search3() {
        Assertions.assertEquals(1, easySearch.search("как дела!.Что делаешь?", "дела"));
    }

    @Test
    public void search4() {
        Assertions.assertEquals(0, easySearch.search("Привет-привет", "привет"));
    }

    @Test
    public void search5() {
        Assertions.assertEquals(0, easySearch.search("4-х", "4"));
    }

    @Test
    public void search6() {
        Assertions.assertEquals(0, easySearch.search("один и 1", "Один"));
    }

    @Test
    public void search7() {
        Assertions.assertEquals(1, easySearch.search("бабушка бабушке бабушку", "бабушка"));
    }

    @Test
    public void search8() {
        Assertions.assertEquals(0, easySearch.search("Мама мыла раму", "мыл"));
    }

    @Test
    public void search9() {
        Assertions.assertEquals(0, easySearch.search("Учет РеГистРа", "регистра"));
    }

    @Test
    public void search10() {
        Assertions.assertEquals(1, easySearch.search("один,два,три", "три"));
    }
}