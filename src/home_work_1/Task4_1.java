package home_work_1;

public class Task4_1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i <10; i++){
            numbers[i] = (int) (Math.random()*100);
            if (numbers[i]%2 != 0){
                System.out.println(numbers[i] + " не четное число");
            }
        }
    }
}
