package Magazine;

public abstract class Product {
   private String name;
   private double price;
   private double rank;

/*    public Product(String name, double price, double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public abstract void showInfo();
    /*{
        System.out.print(getName() + " ");
        System.out.print(getPrice() + " ");
        System.out.println(getRank());
    }*/
}
