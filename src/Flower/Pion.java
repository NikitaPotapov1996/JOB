package Flower;

public class Pion extends Flower{

    private String color;

    public Pion(String country, int shelfLife, double price, String color) {
        super(country, shelfLife, price);
        this.color = color;
    }

    public Pion(String country, int shelfLife, double price) {
        super(country, shelfLife, price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
