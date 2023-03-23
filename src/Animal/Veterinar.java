package Animal;

public class Veterinar {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + " пришел на прием");
        animal.getDescription();
    }
}
