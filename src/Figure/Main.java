package Figure;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = new Shape[4];
        figures[0] = new Circle("красный", 10, 10);
        figures[1] = new Circle(20, 20);
        figures[2] = new Rectangle(50, 50);
        figures[3] = new Rectangle("Синий", 40, 40);
        for (int i = 1; i < 5; i++) {
            System.out.print("Фигура № " + i + "- ");
            figures[i-1].draw();
        }
    }
}
