package ru.spqr.sandbox;

public class FirstHello {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        /**Первый расчет**/
        System.out.println(distance1());

        /**Второй расчет**/
        System.out.println(distance2());

    }

    /**
     * Первый расчет
     **/
    public static double distanceX(int x1, int x2) {
        return x2 - x1;
    }

    public static double distanceY(int y1, int y2) {
        return y2 - y1;
    }

    public static double distance1() {
        return Math.sqrt(Math.pow((distanceX(1, 5)), 2) + Math.pow((distanceY(1, 4)), 2));
    }

    /**
     * Второй расчет
     **/
    public static double distance2() {

        Point1 p1 = new Point1(1, 1);
        Point2 p2 = new Point2(5, 4);

        return Math.sqrt(Math.pow((p2.x2 - p1.x1), 2) + Math.pow((p2.y2 - p1.y1), 2));
    }
}