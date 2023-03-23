package Animal;

public class Dog extends Animal {

    public Dog(String name, String food, String noise) {
        this.name = name;
        this.food = food;
        this.noise = noise;
    }


    public String eat() {
        System.out.println(getName() + " ест " + getFood());
        return getFood();
    }

    public String makeNoise() {
        System.out.println(getName() + " издает " + getNoise());
        return getNoise();
    }

    public void getDescription() {
        System.out.println(getName() + " ест " + getFood() + " издает " + getNoise());
    }
}

