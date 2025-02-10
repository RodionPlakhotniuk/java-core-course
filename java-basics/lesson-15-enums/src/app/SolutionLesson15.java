import enumHelper.Day;
import models.AdviceGenerator;

import java.util.Scanner;

public class SolutionLesson15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привіт, я Бруно генератор порад на тиждень");
        System.out.println("Щоб дізнатися свою пораду веди день тижня в такому форматі: MONDAY");
        String usersDay = scanner.nextLine();
        Day day = Day.valueOf(usersDay.toUpperCase());
        AdviceGenerator adviceGenerator = new AdviceGenerator();
        System.out.println("Твоя порада на " + usersDay + ":");
        adviceGenerator.advise(day);

        System.out.println();

        System.out.println("Дякую, що скористався генератором порад\n" +
                "Обери наступну дію:\n" +
                "1. Отримати ще одну пораду 2.Завершити роботу");
        int usersNum = scanner.nextInt();
        scanner.nextLine();
        if (usersNum == 1) {
            System.out.println("Напиши день тижня, на я кий хочешь отримати пораду");
            usersDay = scanner.nextLine();
            day = Day.valueOf(usersDay.toUpperCase());
            System.out.println("Твоя порада на " + usersDay + ":");
            adviceGenerator.advise(day);
            System.out.println("Нехай щастить, до зустрічі!");
        } else if (usersNum == 2) {
            System.out.println("До нових зустрічей, радий знайомству");
        }
        scanner.close();
    }
}
