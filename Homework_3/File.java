package Homework_3;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void createFile(Registration person) {

        try(FileWriter file = new FileWriter(person.getSurname(), true)) {
            file.write(person.toFile() + "\n");
            System.out.println("Регистрация успешно завершена");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
