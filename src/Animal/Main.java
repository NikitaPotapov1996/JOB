package Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Борис", "сметанка", "мяу");
        animals[1] = new Dog("Шарик", "косточки", "гав");
/*        animals[0].eat();
        animals[1].eat();
        animals[0].makeNoise();
        animals[1].makeNoise();
        animals[0].getDescription();
        animals[1].getDescription();*/
        for (int i = 0; i < 2; i++) {
            animals[i].eat();
            animals[i].makeNoise();
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            Veterinar.treatAnimal(animals[i]);
            System.out.println();
        }
    }
}
