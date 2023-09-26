package Homework_3;

public class RegistrationException {

    public static boolean checkRegistration(Registration person) {
        try {
            checkSurName(person);
            checkName(person);
            checkPatronymic(person);
            checkBirthday(person);
            checkPhone(person);
            checkGender(person);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void checkSurName(Registration person) throws Exception {
        if (person.getSurname().isEmpty()) {
            throw new Exception("Ошибка, вы не ввели свою фамилию");
        }
        if (person.getSurname().length() < 2) {
            throw new Exception("Ошибка, нельзя вводить фамилию меньше 2 символов");
        }
        if (person.getSurname().length() > 20) {
            throw new Exception("Ошибка, вы ввели слишком длинную фамилию (20 символов)");
        }
        if (!person.getSurname().matches("[а-яА-Я]+")) {
            throw new Exception("Ошибка, не верный ввод фамилии");
        }
    }
    public static void checkName(Registration person) throws Exception {
        if (person.getName().isEmpty()) {
            throw new Exception("Ошибка, вы не ввели свое имя");
        }
        if (!person.getName().matches("[а-яА-Я]+")) {
            throw new Exception("Ошибка, не верный ввод имени");
        }
    }

    public static void checkPatronymic(Registration person) throws Exception {
        if (person.getPatronymic().isEmpty()) {
            throw new Exception("Ошибка, вы не ввели свое отчество");
        }
        if (person.getPatronymic().length() < 7) {
            throw new Exception("Ошибка, вы ввели слишком короткое отчество (меньше 7 символов)");
        }
        if (!person.getPatronymic().matches("[а-яА-Я]+")) {
            throw new Exception("Ошибка, не верный ввод отчества");
        }
    }

    public static void checkBirthday(Registration person) throws Exception {
        if (person.getBirthday().isEmpty()) {
            throw new Exception("Ошибка, вы не ввели дату рождения [дд.мм.гггг]");
        }
        if (person.getBirthday().length() != 10 | person.getBirthday().charAt(2) != '.' | person.getBirthday().charAt(5) != '.') {
            throw new Exception("Ошибка, вы ввели не верную дату рождения");
        }
        if (Integer.parseInt(person.getBirthday().charAt(0) + "" + person.getBirthday().charAt(1)) > 31 ||
                Integer.parseInt(person.getBirthday().charAt(0) + "" + person.getBirthday().charAt(1)) < 1) {
            throw new Exception("Ошибка, не верная дата рождения (день)");
        }
        if (Integer.parseInt(person.getBirthday().charAt(3) + "" + person.getBirthday().charAt(4)) > 12 ||
                Integer.parseInt(person.getBirthday().charAt(3) + "" + person.getBirthday().charAt(4)) < 1) {
            throw new Exception("Ошибка, не верная дата рождения (месяц)");
        }
        if (Integer.parseInt(person.getBirthday().charAt(6) + "" + person.getBirthday().charAt(7) +
                person.getBirthday().charAt(8) + person.getBirthday().charAt(9)) > 2023 ||
                Integer.parseInt(person.getBirthday().charAt(6) + "" + person.getBirthday().charAt(7) +
                        person.getBirthday().charAt(8) + person.getBirthday().charAt(9)) < 1940) {
            throw new Exception("Ошибка, не верная дата рождения (год)");
        }
    }

    public static void checkPhone(Registration person) throws Exception {
        if (person.getPhone() <= 999999L) {
            throw new Exception("Ошибка, вы ввели не верный номер телефона (в номере меньше 7 цифр)");
        }
        if (person.getPhone() > 99999999999L) {
            throw new Exception("Ошибка, вы ввели не верный номер телефона (в номере больше 12 цифр)");
        }
    }

    public static void checkGender(Registration person) throws Exception {
        if (!person.getGender().equals('F') & !person.getGender().equals('M') &
        !person.getGender().equals('f') & !person.getGender().equals('m')) {
            throw new Exception("Ошибка, вы ввели не верный пол");
        }
    }
}