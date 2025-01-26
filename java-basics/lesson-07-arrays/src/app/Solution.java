import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201)-100;
        }
        System.out.print("Елементи масиву: [ ");
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println("]");

        int minNum = 0;
        int minus = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] < minNum){
            minus += array[i];
        }
        }
        System.out.println("Сума від'ємних чисел:"+ minus);

        int pairNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                pairNum++;
            }
        }
        System.out.println("Кількість парних чисел:" + pairNum);

        int unPairNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                unPairNum++;
            }
        }
        System.out.println("Кількість непарних чисел:" + unPairNum);

        int indNumMax = 0;
        int max = 2147483647;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max){
                max = array[i];
                indNumMax = i;
            }
        }
        System.out.println("Найменший елемент:" + max + "(з індексом " + indNumMax + ")");

        int indNumMin = 0;
        int min = -2147483648;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min){
                min = array[i];
                indNumMin = i;
            }
        }
        System.out.println("Найбільший елемент:" + min + "(з індексом " + indNumMin + ")");

        double suma = 0;
        int count = 0;
        boolean negative = false;

        for(int number : array) {
            if (number < 0 && !negative) {
                negative = true;
            } else if (negative) {
                suma += number;
                count++;
            }
        }

        if (count > 0) {
            double average = suma / count;
            System.out.printf("6.Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        } else {
            System.out.println("У масиві немає від'ємних чисел або від'ємне число є останнім.");
        }

    }
}
