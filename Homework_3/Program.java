package Homework_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите через пробел: \n" +
                    "Фамилия - Имя - Отчество - Дата рождения(дд.мм.гггг) - Номер телефона - Пол(M или F)");
            String[] input = scan.nextLine().split(" ");
            Registration person = new Registration(
                    input[0],
                    input[1],
                    input[2],
                    input[3],
                    Long.parseLong(input[4]),
                    input[5].charAt(0));

            if (RegistrationException.checkRegistration(person))
                File.createFile(person);

        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}