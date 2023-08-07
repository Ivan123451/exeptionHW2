package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число 1 - ");
            int number = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("введите число 2 - ");
            int number2 = scanner2.nextInt();
            if (number2 == 0) {
                throw new DivisionByZeroException("Делить на ноль недопустимо");
            }
            int result = number / number2;
            System.out.println("результат деления - " + result);
        }
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
