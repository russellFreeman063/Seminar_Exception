package Homework_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {

/*
  TODO:Реализуйте метод, который запрашивает у пользователя ввод дробного числа
   (типа float), и возвращает введенное значение. Ввод текста вместо числа
   не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
 */

    public static void main(String[] args) {

        System.out.println(inputFloatNum());

    }

    public static float inputFloatNum() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            return scan.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка, неверный ввод.");
            return inputFloatNum();
        } finally {
            scan.close();
        }
    }
}