package _10_JOB;

public class Student {
    private String firstName, lastName, group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        int sum;
        if (averageMark == 5) {
            return sum = 2000;
        } else return sum = 1900;
    }

    public void show() {
        System.out.print(getLastName() + " ");
        System.out.print(getFirstName() + " ");
        System.out.print(getGroup() + " ");
        System.out.print(getAverageMark() + " ");
    }
}
