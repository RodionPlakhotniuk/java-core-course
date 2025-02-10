package models;

import enumHelper.Day;
import service.DayHelper;

public class AdviceGenerator implements DayHelper {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Плануйте свій день: Записуйте свої завдання та розставляйте пріоритети.");
                break;
            case TUESDAY:
                System.out.println("Концентруйтеся: Уникайте відволікань та зосередьтеся на виконанні найважливіших завдань.");
                break;
            case WEDNESDAY:
                System.out.println("Робіть перерви: Короткі перерви допоможуть вам залишатися бадьорими та продуктивними.");
                break;
            case THURSDAY:
                System.out.println("Працюйте в команді: Співпраця з колегами може призвести до кращих результатів.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Відвідайте музеї та галереї: Дізнайтеся більше про історію та культуру свого міста.");
                break;
            case SUNDAY:
                System.out.println("Проведіть час з сім'єю та друзями: Насолодіться спілкуванням та відпочинком у колі близьких людей.");
                break;
            default:
                System.out.println("Спробуй ще раз, веди день тижня коректно:)");
        }
    }
}
