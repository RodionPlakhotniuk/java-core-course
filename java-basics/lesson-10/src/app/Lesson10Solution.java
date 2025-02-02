import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Lesson10Solution {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int [] array = new int[5];

     //Task 1
        System.out.println("Розрахунок квадрату числа");
        System.out.println("1. Введіть ціле число:");
        int userNumber = scan.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d.\n", userNumber, squareNumbers(userNumber));

        System.out.println();
     //Task 2
        System.out.println("Розрахунок радіусу циліндра \n" +
                "*Примітка число водити треба в такому форматі 10 або 10,5");
        System.out.println("Ведіть радіус циліндру:");
        double radius = scan.nextDouble();
        System.out.println("Ведіть висоту циліндру:");
        double height = scan.nextDouble();
        System.out.printf("2. Об'єм циліндра з радіусом %.1f  і висотою %.1f" +
                " дорівнює %f", radius, height, cylinderVolume(radius, height));

        System.out.println();
        System.out.println();

        //Task 3
        System.out.println("Метод для суми масиву");
        sumArray(array);
        System.out.println();

        //Task 4
        scan.nextLine();
        System.out.println("4.Метод повертає рядок у зворотньому порядку.");
        System.out.println("Ведіть текст");
        String lineOne = scan.nextLine();
        System.out.println("Ведений рядок: " + lineOne);
        System.out.println("Рядок в зворотньому порядку: " + lineOpposite(lineOne));
        System.out.println();

        //Task 5
        System.out.println("5. Введіть a:");
        int a = scan.nextInt();
        System.out.println("Введіть b:");
        int b = scan.nextInt();
        System.out.printf("Результат %d^%d дорівнює %d.\n", a, b, ainb(a,b));

        System.out.println();
        //Task 6
        System.out.println("6.Метод, який виводить рядок n кількість раз, яку оберав користувач");
        System.out.println("Введіть ціле число:");
        int quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("Ведіть текст");
        String text = scan.nextLine();
        System.out.println("Ведене число: " + quantity);
        System.out.println("Ведений рядок: " + text);
        viewOfTheRow(quantity, text);

    }
    public static int squareNumbers (int a){
        int square = a * a;
        return square;
    }

    public static double cylinderVolume (double radius, double height){
        double result = Math.PI * (radius * radius) * height;
        return result;
    }

    public static int sumArray(int[] array){
    Random random = new Random();
    int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)+1;
            sum += array[i];
        }
        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");
        return sum;
    }

    public static String lineOpposite(String line) {
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        return reversed;
    }

    public static int ainb(int a, int b){
        int number = (int) Math.pow(a, b);
        return number;
    }

    public static void viewOfTheRow(int numbers, String lines) {
        for (int i = 0; i < numbers; i++) {
            System.out.print(lines + "\n");
        }
    }
}

