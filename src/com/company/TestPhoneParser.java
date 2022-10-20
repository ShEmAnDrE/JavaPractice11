package com.company;

import java.util.Scanner;

public class TestPhoneParser {
    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            char choice;
            System.out.println("Выберите одну из нескольких команд:");
            System.out.println("1 - Ввод номера и приведение его к формату \"+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>\"");
            System.out.println("2 - Ввод номера и разбиение его на составляющие (код, город и номер)");
            System.out.println("Любая дргуая клавиша - Выход из программы");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine().charAt(0);
            String number = "";
            switch (choice) {
                case '1' -> {
                    System.out.println("Введите номер");
                    number = sc.nextLine();
                    System.out.println("Исходный номер: " + number);
                    System.out.println("Получившийся номер: " + new PhoneParser(number));
                }
                case '2' -> {
                    System.out.println("Введите номер");
                    number = sc.nextLine();
                    System.out.println("Исходный номер: " + number);
                    System.out.println("Получившийся номер: " + new PhoneParser(number).printParseNumber());
                }
                default -> {
                    System.out.println("До свидания!");
                    f = false;
                }
            }
        }
    }
}
