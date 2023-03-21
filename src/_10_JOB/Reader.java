package _10_JOB;

import java.security.spec.RSAOtherPrimeInfo;

public class Reader {
    private String fullName, dayOfBirthday, phone;
    private int numberBillet, faculty;

    public Reader(String fullName, int numberBillet, int faculty, String dayOfBirthday, String phone) {
        this.fullName = fullName;
        this.numberBillet = numberBillet;
        this.faculty = faculty;
        this.dayOfBirthday = dayOfBirthday;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberBillet() {
        return numberBillet;
    }

    public void setNumberBillet(int numberBillet) {
        this.numberBillet = numberBillet;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(String type) {
        System.out.println(getFullName() + " взял " + type);
    }

    public void takeBook(Book book) {
        System.out.println(getFullName() + " взял " + book.getType() + " автора " + book.getAuthor());
    }

}


