package app;

import models.Car;
import models.Employee;

public class SolutionLesson12 {
    public static void main(String[] args) {


        Employee rodion = new Employee("Rodion", "Plakhotniuk", "Java Developer", "rodion@example.com",501234567,22 );
        System.out.println(rodion);

        Car car = new Car();
        car.startElectricity();
        car.startCommand();
        car.startFuelSystem();

    }
}
