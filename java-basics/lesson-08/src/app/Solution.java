import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);


        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        System.out.println("Ведіть число для пошуку в масиві");
        int userNumber = scan.nextInt();

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == userNumber) {
                System.out.println("Індекс числа " + userNumber + " у відсортованому масиві: " + mid);
                break;
            } else if (array[mid] < userNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > right) {
            System.out.println("Числа " + userNumber + " немає у масиві.");
        }

    }
}

