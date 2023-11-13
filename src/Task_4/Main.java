package Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть дату у форматі dd/mm/yyyy: ");
        String dateInput = scanner.nextLine();

        int sum = calculateDigitSum(dateInput);

        System.out.println("Сума цифр дати: " + sum);
    }

    private static int calculateDigitSum(String date) {
        int sum = 0;

        String dateWithoutSlash = date.replace("/", "");

        char[] characters = dateWithoutSlash.toCharArray();

        for (char c : characters) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
}