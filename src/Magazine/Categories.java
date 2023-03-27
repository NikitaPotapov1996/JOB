package Magazine;

import java.util.Arrays;

public class Categories {


    private String name;
    public Product product[];

    public Categories(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.print(getName() + " ");
        System.out.print(getProduct() + " ");
    }

    public static void main(String[] args) {


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


        Categories categories1 = new Categories("balls", balls);

        balls[0].showInfo();
        categories1.showInfo();
    }
}