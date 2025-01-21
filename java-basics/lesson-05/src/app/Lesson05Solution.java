import java.util.Scanner;

public class Lesson05Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String welcom = "Привіт, мене звуть Файні, я твій особистий помічник";
        String meet = "Давай познайомимось, як тебе звати?";
        String meet1 = ",дуже приємно:)";
        String option = "Тепер напиши номер опції, яка тебе цікавить:\n" +
                "1.Розрахунок податку з зарплати\n" +
                "2.Розрахунок пенсії\n" +
                "3.Комунальні послуги";
        String sum = "Чудовий вибір, веди свою зарплату,і я розрахую податок, який необхідно сплатити\n" +
                "*Веди свою зарплату уважно будь-ласка, як приклад 10000 або 10000.33";
        String tax = "Твій податок з зарплати складає: ";
        String buy = ",дякую, що використовуєш мене, до нових зустрічей:)";
        String error = ", ти вела не вірно число, перевір умову знов, і спробуй ще раз";
        String curency = " грн";


        System.out.println(welcom);
        System.out.println(meet);
        String userName = scan.nextLine();
        System.out.println(userName + meet1);
        System.out.println(option);
        int numberOption = scan.nextInt();
        System.out.println(sum);
        int salary = scan.nextInt();

        if(salary >= 0 && salary <= 10000){
        salary *= 0.025;
        System.out.println(tax + salary);
        System.out.println(userName + buy + curency);
        }
        else if(salary > 10000 && salary <= 25000){
            salary *= 0.043;
            System.out.println(tax + salary + curency);
            System.out.println(userName + buy);
        }
        else if(salary > 25000){
            salary *= 0.067;
            System.out.println(tax + salary + curency);
            System.out.println(userName + buy);
        }
        else {
            System.out.println(userName + error);
        }


    }
}

