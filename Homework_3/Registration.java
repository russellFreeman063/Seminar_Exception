package Homework_3;

public class Registration {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private long phone;
    private Character gender;

    public Registration(String surname, String name, String patronymic, String birthday, long phone, Character gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public Character getGender() {
        return gender;
    }
    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String toFile() {
        return String.format("<%s><%s><%s><%s><%d><%c>", surname, name, patronymic, birthday, phone, gender);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %c", surname, name, patronymic, birthday, phone, gender);
    }
}
