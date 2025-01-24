public class Lesson06Solution {
    public static void main(String[] args) {

        int a = 0;
        for (int i = 1; i <=6; i++) {
            a += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, a);
        }

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + a);
    }
}
