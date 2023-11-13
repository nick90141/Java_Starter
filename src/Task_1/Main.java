package Task_1;

public class Main {
    public static void main(String[] args) {
        int number = 123;
        int sum = calculateDigitSum(number);
        System.out.println("Сума цифр числа " + number + " дорівнює " + sum);
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;

            num /= 10;
        }

        return sum;
    }
}
