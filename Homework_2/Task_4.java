package Homework_2;

import java.util.Scanner;

public class Task_4 {
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String string = scan.nextLine();
            if (string.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }
            System.out.println("Строка: " + string);
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
