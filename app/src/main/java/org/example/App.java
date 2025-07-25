package org.example;

public class App {
    public static void main(String[] args) {
        var p1 = new Point(9.2, 11.8, 0.5);
        var p2 = new Point(7.0, 9.2, -12.0);

        var addPoint = p1.add(p2);

        System.out.printf("x: %f\n", addPoint.x());
        System.out.printf("x: %f\n", addPoint.y());
        System.out.printf("x: %f\n", addPoint.z());
    }
}
