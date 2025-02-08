package models;

import service.SquareFigure;

public class Square implements SquareFigure {

    private double sideOfASquare;

    public Square(double sideOfASquare) {
        this.sideOfASquare = sideOfASquare;
    }

    public double getSideOfASquare() {
        return sideOfASquare;
    }

    public void setSideOfASquare(double sideOfASquare) {
        this.sideOfASquare = sideOfASquare;
    }

    @Override
    public double calculatingTheAreaOfFigure() {
        double calculationOfAreaOfASquare = sideOfASquare * sideOfASquare;
        return calculationOfAreaOfASquare;
    }
}
