package ru.spqr.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void PointTests() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 4);

        Assert.assertEquals(p1.distance(p2), 5);
        System.out.println("Значения равны");
    }

    @Test
    public void PointTests2() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 4);

        Assert.assertNotEquals(p1.distance(p2), 6);
        System.out.println("Значения не равны");
    }

}
