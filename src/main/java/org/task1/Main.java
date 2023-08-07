package org.task1;

import com.sun.jdi.InvalidLineNumberException;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("введите число: ");
            int number = scan.nextInt();
            if (number <= 0) {
                throw new InvalidNumberException("некоректное число");
            }

            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());

        }


    }
}