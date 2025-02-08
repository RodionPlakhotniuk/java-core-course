package models;

import service.SquareFigure;

public class Circle implements SquareFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatingTheAreaOfFigure() {
        double areaOfACircle = Math.PI * (radius * radius);
        return areaOfACircle;
    }
}
