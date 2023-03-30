package Flower;

public class Flower {

    static int count;
    private String Country;
    private int ShelfLife;
    private double price;

    public Flower(String country, int shelfLife, double price) {
        Country = country;
        ShelfLife = shelfLife;
        this.price = price;
        count++;
    }

    public Flower() {
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getShelfLife() {
        return ShelfLife;
    }

    public void setShelfLife(int shelfLife) {
        ShelfLife = shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
