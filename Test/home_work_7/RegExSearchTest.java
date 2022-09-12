package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegExSearchTest {

    private final RegExSearch regExSearch = new RegExSearch();

    @Test
    public void search1() {
        Assertions.assertEquals(1, regExSearch.search("привет,какдела!", "привет"));
    }

    @Test
    public void search2() {
        Assertions.assertEquals(1, regExSearch.search("привет;какдела!", "какдела"));
    }

    @Test
    public void search3() {
        Assertions.assertEquals(1, regExSearch.search("как дела!.Что делаешь?", "дела"));
    }

    @Test
    public void search4() {
        Assertions.assertEquals(1, regExSearch.search("Привет-привет", "привет"));
    }

    @Test
    public void search5() {
        Assertions.assertEquals(1, regExSearch.search("4-х", "4-х"));
    }

    @Test
    public void search6() {
        Assertions.assertEquals(0, regExSearch.search("один и 1", "Один"));
    }

    @Test
    public void search7() {
        Assertions.assertEquals(1, regExSearch.search("бабушка бабушке бабушку", "бабушка"));
    }

    @Test
    public void search8() {
        Assertions.assertEquals(0, regExSearch.search("Мама мыла раму", "мыл"));
    }

    @Test
    public void search9() {
        Assertions.assertEquals(0, regExSearch.search("Учет РеГистРа", "регистра"));
    }

    @Test
    public void search10() {
        Assertions.assertEquals(1, regExSearch.search("один,два,три", "три"));
    }

    @Test
    public void search11() {
        Assertions.assertEquals(5, regExSearch.search("три, три.три .-три ТРИ!три", "три"));
    }
}