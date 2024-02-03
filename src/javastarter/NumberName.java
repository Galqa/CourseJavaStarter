package javastarter;

/*                 Завдання 3
 Створіть програму, яка виводить у консоль число імені, наприклад,
 на вхід Roman = R(18) + O(15) + M(13) + A(1) + N(14) = 61, на вихід 61.
*/

import java.util.Scanner;

public class NumberName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");

        String name = scanner.nextLine();
        name = name.toUpperCase();

        int nameNumber = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int letterNumber = letter - 'A' + 1;
            nameNumber += letterNumber;
        }
        System.out.println("Число вашого імені: " + nameNumber);
    }
}
