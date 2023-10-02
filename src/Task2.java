//Напишіть метод, який приймає число, яке не містить нулів та повертає цифри у зворотному порядку.
//Наприклад, на вхід 789, на вихід 987.

public class Task2 {
    public static void main(String[] args) {
        int number = 789;
        printReverseDigits(number);
    }
    public static void printReverseDigits(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Цифри числа у зворотному порядку: " + reverse);
    }
}




