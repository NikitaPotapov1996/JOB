package Magazine;

public class Basket {

    private String name;
    private Product[] product;

    public Basket(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    public Basket() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public void showInfo() {
        for (int j = 0; j < product.length; j++) {
            System.out.print("Название продукта " + "\"" + product[j].getName() + "\" ");
            System.out.print(" Цена продукта " + "\"" + product[j].getPrice() + "\" ");
            System.out.print(" Оценка продукта " + "\"" + product[j].getRank() + "\" ");
            System.out.println();
        }
        System.out.println();
    }
}
