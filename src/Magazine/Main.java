package Magazine;

public class Main {
    public static void main(String[] args) {

        // Каталог продуктов
        Product[] balls = new Product[3];
        balls[0] = new Product("Мяч для воллейбола", 1500.00, 4.6);
        balls[1] = new Product("Мяч для баскетбола", 1800.00, 4.7);
        balls[2] = new Product("Мяч для футбола", 2000.00, 4.8);

        Product[] phones = new Product[3];
        phones[0] = new Product("iPhone", 20000.00, 4.8);
        phones[1] = new Product("Samsung", 25000.00, 4.5);
        phones[2] = new Product("Xiaomi", 10000.00, 4.3);

        Product[] cars = new Product[3];
        cars[0] = new Product("Toyota", 15000000, 4.8);
        cars[1] = new Product("Chevrolet", 10000000, 4.6);
        cars[2] = new Product("Opel", 9000000, 4.5);

        // категории продуктов
        Categories categories = new Categories();
        Categories categories1 = new Categories("Мячи", balls);
        Categories categories2 = new Categories("Телефоны", phones);
        Categories categories3 = new Categories("Машины", cars);

        // Корзины покупок
        Product[] buyProduct1 = new Product[3];
        buyProduct1[0] = new Product("Мяч для баскетбола", 1800.00, 4.7);
        buyProduct1[1] = new Product("iPhone", 20000.00, 4.8);
        buyProduct1[2] = new Product("Chevrolet", 10000000, 4.6);

        Product[] buyProduct2 = new Product[2];
        buyProduct2[0] = new Product("Мяч для футбола", 2000.00, 4.8);
        buyProduct2[1] = new Product("Xiaomi", 10000.00, 4.3);

        Product[] buyProduct3 = new Product[1];
        buyProduct3[0] = new Product("Toyota", 15000000, 4.8);

        // Массив корзин покупок
        Basket basket1 = new Basket("Корзина 1", buyProduct1);
        Basket basket2 = new Basket("Корзина 2", buyProduct2);
        Basket basket3 = new Basket("Корзина 3", buyProduct3);

        // Покупатели
        User user1 = new User("Nikita", "123123", basket1);
        User user2 = new User("Masha", "321321", basket2);
        User user3 = new User("Mama", "000", basket3);


        user1.showInfo();
        basket1.showInfo();

        user2.showInfo();
        basket2.showInfo();

        user3.showInfo();
        basket3.showInfo();
    }
}
