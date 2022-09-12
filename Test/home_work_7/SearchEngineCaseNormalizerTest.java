package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchEngineCaseNormalizerTest {
    private final SearchEngineCaseNormalizer secn = new SearchEngineCaseNormalizer(new EasySearch());

    @Test
    public void searchCaseNormalizer1() {
        Assertions.assertEquals(8, secn.searchCaseNormalizer("дядя, дяди, дяди, дяди, дяде, дядю, дядей, дяде", "дядя", 1));
    }

    @Test
    public void searchCaseNormalizer2() {
        Assertions.assertEquals(7, secn.searchCaseNormalizer("речь, речи, речи, речь, речью, речи, речи, вода", "речь", 3));
    }

    @Test
    public void searchCaseNormalizer3() {
        Assertions.assertEquals(7, secn.searchCaseNormalizer("город, города, городу, город, городом, городе, городе, вода", "город", 2));
    }

    @Test
    public void search1() {
        Assertions.assertEquals(1, secn.search("привет,какдела!", "привет"));
    }

    @Test
    public void search2() {
        Assertions.assertEquals(1, secn.search("привет;какдела!", "какдела"));
    }

    @Test
    public void search3() {
        Assertions.assertEquals(1, secn.search("как дела!.Что делаешь?", "дела"));
    }

    @Test
    public void search4() {
        Assertions.assertEquals(0, secn.search("Привет-привет", "привет"));
    }

    @Test
    public void search5() {
        Assertions.assertEquals(0, secn.search("4-х", "4"));
    }

    @Test
    public void search6() {
        Assertions.assertEquals(0, secn.search("один и 1", "Один"));
    }

    @Test
    public void search7() {
        Assertions.assertEquals(1, secn.search("бабушка бабушке бабушку", "бабушка"));
    }

    @Test
    public void search8() {
        Assertions.assertEquals(0, secn.search("Мама мыла раму", "мыл"));
    }

    @Test
    public void search9() {
        Assertions.assertEquals(0, secn.search("Учет РеГистРа", "регистра"));
    }

    @Test
    public void search10() {
        Assertions.assertEquals(1, secn.search("один,два,три", "три"));
    }

    @Test
    public void search11() {
        Assertions.assertEquals(5, secn.search("три, три.три .-три ТРИ!три", "три"));
    }
}