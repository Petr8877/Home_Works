package home_work_2.loops;

public class Task5 {

    /**
     * 1.5.1 Найти наибольшую цифру натурального числа
     * Метод task5_1 получает число после чего преобразует его в массив
     * по средствам цикла for переберает весь массив и определяет максимальную цифру
     *
     * @return максимальная цифра
     */
    public int task5_1(String num) {
        char[] array1 = num.toCharArray();
        int[] array2 = new int[num.length()];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length(); i++) {
            array2[i] = Character.getNumericValue(array1[i]);
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        return max;
    }

    /**
     * 1.5.2 Вероятность четных случайных чисел
     * Метод task5_2 определяет и подсчитывает колличество четных ччисел в массиве
     *
     * @return колличество четных чисел массива
     */
    public int task5_2(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * 1.5.3. Посчитать четные и нечетные цифры числа
     * Метод task5_3 получает число, преобразует данное число в массив
     * определяет и подсчитывает колличество четных и нечетных цифр
     *
     * @return возвращает количество нечетных цифр
     */
    public String task5_3(String num) {
        char[] array1 = num.toCharArray();
        int[] array2 = new int[num.length()];
        int counter = 0;
        int counter1 = 0;
        for (int i = 0; i < num.length(); i++) {
            array2[i] = Character.getNumericValue(array1[i]);
            if (array2[i] % 2 != 0) {
                counter += 1;
            } else {
                counter1 += 1;
            }
        }
        return "Колличество нечетных цифр " + counter + "Колличество четных чисел " + counter1;
    }

    /**
     * 1.5.4. Ряд Фибоначчи
     * Метод task5_4 получает число
     * выводит в консоль количество значений ряда Фибоначи равному введенному числу
     *
     * @return ряд Фибоначи
     */
    public String task5_4(int count) {
        int a = 1;
        int b = 2;
        StringBuilder result = new StringBuilder();
        if (count <= 0) {
            result = new StringBuilder("Ну нет так нет");
        } else if (count == 1) {
            result.append(a);
        } else if (count == 2) {
            result.append(a).append(" ").append(b);
        } else {
            result.append(a).append(" ").append(b);
            for (int i = 0; i < count - 2; i++) {
                if (i % 2 == 0) {
                    a += b;
                    result.append(" ").append(a);
                } else {
                    b += a;
                    result.append(" ").append(b);
                }
            }
        }
        return result.toString();
    }

    /**
     * 1.5.5. Вывести ряд чисел в диапазоне с шагом
     * Метод task5_5 получает максимум диапозона и шаг
     * проходит по заданному Пользователем диапозону с заданным шагом
     *
     * @return ряд чисел в диапазоне с шагом
     */
    public String task5_5(int max, int step) {
        int min = 0;
        StringBuilder result = new StringBuilder("0");
        int count = min;
        while (count < max) {
            count += step;
            result.append(" ").append(count);
        }
        return result.toString();
    }

    /**
     * 1.5.6. Переворот числа
     * Метод task5_6 получает число и преобразует в массив
     *
     * @return возвращает число с обратным порядком чисел
     */
    public String task5_6(String num) {
        StringBuilder result = new StringBuilder();
        char[] array = num.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }
}
