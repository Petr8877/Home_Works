package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        // Класс Math.
        // Для демонстрации понимая мной были взяты сторонние задания (http://javazadachi.blogspot.com/p/blog-page_20.html)
        // 1. Создайте программу, которая будет генерировать и выводить на экран вещественное псевдослучайное число из промежутка [-3;3).
        int start = -3; // нижняя граница выводимых чисел
        int end = 3; // верхняя граница выводимых чисел
        System.out.println(start + Math.random()*(end*2)); // выводим случайное число. Дополнительно умножаем end на 2 чтобы соблюсти условия задания (от -3 до 3)
        System.out.println();

        //2. Натуральное положительное число записано в переменную n. Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n].
        int n = 10;
        int st = -n; // нижняя граница выводимых чисел
        int en = n; // верхняя граница выводимых чисел
        System.out.println(st + (int)(Math.random()*(en*2))); // выводим ответ
        System.out.println();

        // 3. В переменные a и b записаны целые числа, при этом b больше a. Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].
        int a = 15; // вводим любое число согласно заданию
        int b = 43; // вводим любое число но больше "а"
        System.out.println(a + (int) (Math.random()*(b-a))); // выводим ответ. ставим b-a чтобы не привысить верхнюю границу
        System.out.println();

        // 4. Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов без использования функции Math.toDegrees(n).
        int angle1 = 60;
        int angle2 = 45;
        int angle3 = 40; // снесли значения углов
        double cos1 = Math.cos(Math.toRadians(angle1));
        double cos2 = Math.cos(Math.toRadians(angle2));
        double cos3 = Math.cos(Math.toRadians(angle3)); // вычислили cos, паралельно переводим углы в радианы
        double degreesCos1 = cos1*180 / Math.PI;
        double degreesCos2 = cos2*180 / Math.PI;
        double degreesCos3 = cos3*180 / Math.PI;
        // так как по условия задания мы не можем использовать функцию Math.toDegrees(n)
        // переводим радианы в градусы при помощи математической формулы
        System.out.println("Ответ в радианах");
        System.out.println("Cos угла 60 градусов = " + cos1);
        System.out.println("Cos угла 45 градусов = " + cos2);
        System.out.println("Cos угла 40 градусов = " + cos3);// выводим ответ в радианах
        System.out.println("Ответ в градусах");
        System.out.println("Cos угла 60 градусов = " + degreesCos1);
        System.out.println("Cos угла 45 градусов = " + degreesCos2);
        System.out.println("Cos угла 40 градусов = " + degreesCos3); // выводим ответ в градусах
        System.out.println();

        // 5. В переменных a и b лежат положительные длины катетов прямоугольного треугольника. Вычислить и вывести на экран площадь треугольника и его периметр.
        double a1 = 15;
        double b1 = 29; // вносим значения катетов
        double S = (a1 + b1) / 2; // вычисляем площадь
        double c1 = Math.pow(a1, 2) + Math.pow(b1, 2);
        c1 = Math.sqrt(c1); // вычисляем гипотенузу
        double P = a1 + b1 + c1; // вычисляем периметр
        System.out.println("Площадь треугольника = " + S);
        System.out.println("Периметр треугольника = " + P);
        System.out.println();

        // задачи закончились еще пару примеров применения Math
        // Выведем минимальное и максимальное число
        int num1 = 23;
        int num2 = 87; // вводим любые значения, можно использовать Scanner
        System.out.println("Минимальное значение = " + Math.min(num1, num2));
        System.out.println("Максимальное значени = " + Math.max(num1, num2));
        System.out.println();

        // Выведем минимальное и максимальное число из большего количества чисел
        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);
        int number3 = (int) (Math.random()*100);
        int number4 = (int) (Math.random()*100);
        int number5 = (int) (Math.random()*100);
        int minNumber = Math.min(number1, Math.min(number2, Math.min(number3, Math.min(number4, number5))));
        int maxNumber = Math.max(number1, Math.max(number2, Math.max(number3, Math.max(number4, number5))));
        System.out.println("Минимально число = " + minNumber);
        System.out.println("Максимальное число = " + maxNumber);
        System.out.println();
    }
}
