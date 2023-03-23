package Figure;

public class Circle extends Shape {
    int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.print("Координата 1: " + x + "; ");
        System.out.print("Координата 2: " + y + "; ");
        System.out.print("Цвет " + getColor() + ".");
        System.out.println();
    }
}
