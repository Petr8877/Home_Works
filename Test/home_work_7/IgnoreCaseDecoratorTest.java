package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IgnoreCaseDecoratorTest {

    private final IgnoreCaseDecorator ignoreCaseDecorator = new IgnoreCaseDecorator(new EasySearch());

    @Test
    public void search1() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("привет,какдела!", "пРивет"));
    }

    @Test
    public void search2() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("привет;какдела!", "каКдеЛа"));
    }

    @Test
    public void search3() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("как ДЕЛА!.Что делаешь?", "дела"));
    }

    @Test
    public void search4() {
        Assertions.assertEquals(0, ignoreCaseDecorator.search("Привет-привет", "привет"));
    }

    @Test
    public void search5() {
        Assertions.assertEquals(0, ignoreCaseDecorator.search("4-х", "4"));
    }

    @Test
    public void search6() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("один и 1", "Один"));
    }

    @Test
    public void search7() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("бабушка бабушке бабушку", "БАБУШКА"));
    }

    @Test
    public void search8() {
        Assertions.assertEquals(0, ignoreCaseDecorator.search("Мама мыла раму", "мыл"));
    }

    @Test
    public void search9() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("Учет РеГистРа", "регистра"));
    }

    @Test
    public void search10() {
        Assertions.assertEquals(1, ignoreCaseDecorator.search("один,два,три", "три"));
    }

    @Test
    public void search11() {
        Assertions.assertEquals(6, ignoreCaseDecorator.search("три, три.три .-три ТРИ!три", "три"));
    }
}