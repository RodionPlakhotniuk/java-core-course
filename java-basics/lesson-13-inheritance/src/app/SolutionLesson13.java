import models.Circle;
import models.Square;
import models.Triangle;
import service.SquareFigure;

public class SolutionLesson13 {
    public static void main(String[] args) {

        SquareFigure[] figures = {
                new Circle(4),
                new Triangle(12, 5),
                new Square(5)
        };


        double totalArea = calculateTotalArea(figures);
        System.out.printf("Сумарна площа фігур: %.0f\n",totalArea);
    }

    private static double calculateTotalArea(SquareFigure[] figures) {
        double totalArea = 0;
        for (SquareFigure figure : figures) {
            totalArea += figure.calculatingTheAreaOfFigure();
        }
        return totalArea;
    }
}
