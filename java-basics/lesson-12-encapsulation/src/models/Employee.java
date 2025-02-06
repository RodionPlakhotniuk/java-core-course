package models;

public class Employee {
    private String name;
    private String surname;
    private String profession;
    private String mail;
    private long phone;
    private int age;

    public Employee(String name, String surname, String profession, String mail, long phone, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", mail='" + mail + '\'' +
                ", phone= +380" + phone +
                ", age=" + age +
                '}';
    }
}
