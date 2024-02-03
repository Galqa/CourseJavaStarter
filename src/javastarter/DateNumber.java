package javastarter;

/*  Завдання 4

Створіть програму, яка виводить у консоль число дати.
Наприклад, на вхід 02/11/1995 = 0 + 2 + 1 + 1 + 1 + 9 + 9 + 5 = 28, на вихід = 28.

 */

import java.util.Scanner;

public class DateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дату у форматі дд/мм/рррр:");
        String date = scanner.nextLine();

        int sum = 0;
        for (char c : date.toCharArray()) {
            if (Character.isDigit(c)) {
                int value = Character.getNumericValue(c);
                sum += value;
            }
        }
        System.out.println("Число дати: " + sum);
    }
}

