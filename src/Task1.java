// Напишіть метод, який приймає число та повертає суму цифр цього числа.

public class Task1 {
    public static void main(String[] args) {
            printSumOfDigits(6785432);// число можна змінювати
    }
    public static void printSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сума цифр числа: " + sum);
    }
}



