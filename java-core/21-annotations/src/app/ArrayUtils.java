package app;

import java.util.Arrays;

public class ArrayUtils {

    @MethodInfo(name = "findSum",
            returnType = int.class,
            description = "Метод для знаходження суми у заданому масиві цілих чисел")

    @Author(name = "Rodion",
            surname = "Plakhotniuk")
    public int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @MethodInfo(name = "sortArray",
            returnType = void.class,
            description = "Метод для сортування масиву")

    @Author(name = "Rodion",
            surname = "Plakhotniuk")
    public void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    @MethodInfo(name = "targetFinding",
            returnType = void.class,
            description = "Метод для перевірки, чи містить масив певний елемент")

    @Author(name = "Rodion",
            surname = "Plakhotniuk")
    public void targetFinding(int[] arr) {
        int target = 8;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Ціль " + target + " була знайдена за індексом " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ціль " + target + " відсутня в масиві");
        }

    }

    @MethodInfo(name = "findingTheMaximumElement",
            returnType = int.class,
            description = "Метод для знаходження максимального елемента в масиві")

    @Author(name = "Rodion",
            surname = "Plakhotniuk")
    public int findMaxElementStream(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім");
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
