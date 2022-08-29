package home_work_2.loops;

public class Task3 {

    /**
     * Метод degree возводит переданное число в переданную степень
     *
     * @param number переданное вещественное число
     * @param degree переданная степень (целое и положительное число)
     * @return результат возведения в степень
     */
    public double degree(double number, int degree) {
        int i = 1;
        double result = number;
        while (i < degree) {
            result = result * number;
            i++;
        }
        return result;
    }
}
