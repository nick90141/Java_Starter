package Task_2;

public class Main  {
    public static void main(String[] args) {
        int inputNumber = 789;
        int reversedNumber = reverseDigits(inputNumber);
        System.out.println("Зворотній порядок: " + reversedNumber);
    }

    public static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}

