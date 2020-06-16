package ru.spqr.sandbox;

public class FirstHello {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        /**Первый расчет**/
        int x1 = 1;
        int x2 = 5;
        int y1 = 1;
        int y2 = 4;
        System.out.println("Расстояние между точками " + Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) + " единиц");

        /**Второй расчет**/
        System.out.println("Расстояние между точками " + distance1() + " единиц");

    }

    /**
     * Второй расчет
     **/
    public static double distance1() {

        Point1 p1 = new Point1(1, 1);
        Point2 p2 = new Point2(5, 4);

        return Math.sqrt(Math.pow((p2.x2 - p1.x1), 2) + Math.pow((p2.y2 - p1.y1), 2));
    }
}