package Animal;

public abstract class Animal {
    public String name, food, noise;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public abstract String eat();

    public abstract String makeNoise();

    public abstract void getDescription();
}
