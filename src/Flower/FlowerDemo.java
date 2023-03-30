package Flower;

import java.util.Arrays;

public class FlowerDemo {


    public static void main(String[] args) {
        Rose rose1 = new Rose("Турция", 10, 200);
        Rose rose2 = new Rose("Турция", 10, 400, "Красные");
        Rose rose3 = new Rose("Турция", 10, 500, "Белые");
        Pion pion1 = new Pion("Италия", 8, 400, "Белые");
        Pion pion2 = new Pion("Италия", 12, 600, "Синие");
        Orchid orchid1 = new Orchid("Франция", 15, 800);
        Flower[][] bucket = {
                {rose1, rose2, rose3},
                {rose2, rose2, rose2, rose2, rose2, rose2, rose2},
                {pion1, pion1, pion1, pion2, pion2},
                {orchid1},
                {rose1, rose2, rose3, pion1, pion2, orchid1}
        };

/*        rose1.getPrice();
        System.out.println(Arrays.toString(bucket[1]));
        System.out.println(bucket[1].length);
        bucket[1][2].getPrice();*/

        for (int i = 0; i < bucket.length; i++){
            double result=0;
            for (int j=0;j<bucket[i].length;j++){
                result= bucket[i][j].getPrice()+result;
                if (j==bucket[i].length-1){
                    break;
                }
            }
            System.out.println("Цена букета " + (i+1) + " " + result);
        }

        System.out.println("Всего видов цветов " + Flower.count);
    }
}

