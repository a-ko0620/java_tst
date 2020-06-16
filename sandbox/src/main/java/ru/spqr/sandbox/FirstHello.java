package ru.spqr.sandbox;

public class FirstHello {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        double d;

         Point p1 = new Point(1, 1);
         Point p2 = new Point(5, 4);

         d = distance(p1 ,p2);

        /**Первый расчет**/
        System.out.println("Расстояние между точками, используя статический метод в этом классе " + d + " единиц");

        /**Второй расчет**/
        System.out.println("Расстояние между точками, используя метод в классе Point " + p1.distance(p2) + " единиц");

    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}