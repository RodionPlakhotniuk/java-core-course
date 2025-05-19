package app;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayUtils utils = new ArrayUtils();
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Демонстрація виклику методів:");
        int sum = utils.findSum(arr);
        System.out.println("Сума елементів: " + sum);

        utils.sortArray(arr);
        System.out.println("Відсортований масив: " + Arrays.toString(arr));

        utils.targetFinding(arr);

        int max = utils.findMaxElementStream(arr);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("====================");


        System.out.println("== Інформація про методи через рефлексію ==");

        Class<?> arrayUtilsClass = ArrayUtils.class;
        Method[] methods = arrayUtilsClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Метод: " + method.getName());

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("  Назва: " + methodInfo.name());
                System.out.println("  Тип повернення: " + methodInfo.returnType().getSimpleName());
                System.out.println("  Опис: " + methodInfo.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("  Автор: " + author.name() + " " + author.surname());
            }

            System.out.println("--------------------");
        }
    }
}
