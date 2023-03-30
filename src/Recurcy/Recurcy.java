package Recurcy;

public class Recurcy {

    public static int Chisla(int x, int y) {
        if (x < y) {
            Chisla(x, y - 1);
            System.out.println(y);
            if (x == y) {
                return 1;
            }
        } else if (x > y) {
            System.out.println(x);
            Chisla(x - 1, y);
            if (x == y) {
                return 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Chisla(20, 10);
    }
}
