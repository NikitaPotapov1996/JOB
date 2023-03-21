package _10_JOB;

public class Phone {
    private String number, model, person;
    private int weight;

    public Phone(String number, String model, String person) {
        this.number = number;
        this.model = model;
        this.person = person;
    }

    public Phone(String number, String model, int weight, String person) {
        this(number, model, person);
        this.weight = weight;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void receiveCall(String person, String number) {
        System.out.println("Звонит " + getPerson() + " " + getNumber());
    }

    public void receiveCall(String number) {
        System.out.println("Звонит " + getPerson());
    }
}