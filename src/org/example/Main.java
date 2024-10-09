package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число(int): ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою(float/double): ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Введіть строку(string): ");
        String stringValue = scanner.next();

        System.out.print("Введіть логічне значення(boolean): ");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("\nВиведення даних у різних форматах:");

        System.out.println("\n 1 підхід");
        System.out.println("Ціле число (десяткова система): " + intValue);
        System.out.println("Число з плаваючою точкою: " + doubleValue);
        System.out.println("Строка: " + stringValue);
        System.out.println("Логічне значення: " + boolValue);

        System.out.println("\n2 підхід");
        System.out.printf("Ціле число (десяткова система): %d%n", intValue);
        System.out.printf("Ціле число (шістнадцяткова система): %x%n", intValue);
        System.out.printf("Ціле число (вісімкова система): %o%n", intValue);
        System.out.printf("Число з плаваючою точкою(3 символи після коми): %.3f%n", doubleValue);
        System.out.printf("Строка (до 6 символів): %.6s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", boolValue);

        System.out.println("\n3 підхід");
        System.out.printf("Ціле число (десяткова система): %d%n", intValue);
        System.out.printf("Ціле число (шістнадцяткова система): %x%n", intValue);
        System.out.printf("Ціле число (вісімкова система): %o%n", intValue);
        System.out.printf("Число з плаваючою точкою(2 символи після коми): %.2f%n", doubleValue);
        System.out.printf("Строка (до 4 символів): %.4s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", boolValue);
    }
}