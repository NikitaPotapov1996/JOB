package Animal;

public abstract class Cat extends Animal{

    public Cat(String name) {
        this.name=name;
    }

    public abstract String eat();

    public abstract String makeNoise();

    public abstract String getDescription();
}
