package _10_JOB;

public class Aspirant extends Student {

    private String textWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String textWork) {
        super(firstName, lastName, group, averageMark);
        this.textWork = textWork;
    }

    public Aspirant() {
    }

    public String getTextWork() {
        return textWork;
    }

    public void setTextWork(String textWork) {
        this.textWork = textWork;
    }

    public int getScholarship() {
        int sum;
        if (averageMark == 5) {
            return sum = 2500;
        } else return sum = 2200;
    }

    public void show(){
        System.out.print(getLastName() + " ");
        System.out.print(getFirstName() + " ");
        System.out.print(getGroup() + " ");
        System.out.print(getAverageMark() + " ");
        System.out.print(getTextWork() + " ");
    }
}
