package Animal;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String eat();

    public abstract String makeNoise();

    public abstract String getDescription();
}
