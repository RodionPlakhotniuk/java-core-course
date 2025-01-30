import java.util.Random;

public class Solution {
    public static void main(String[] args) {


        Random random = new Random();

        int[][] arrays = new int[4][4];
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(50) + 1;
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        int pair = 0;
        int unpair = 0;
        long pair2 = 1;
        long unpair2 = 1;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i % 2 == 0) {
                    pair += arrays[i][j];
                }
                if (i % 2 != 0) {
                    unpair += arrays[i][j];
                }
                if (j % 2 == 0) {
                    pair2 *= arrays[i][j];
                }
                if (j % 2 != 0) {
                    unpair2 *= arrays[i][j];
                }

            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + pair);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + unpair);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + pair2);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + unpair2);


        boolean isMagic = true;
        int magicSum = 0;


        for (int j = 0; j < arrays[0].length; j++) {
            magicSum += arrays[0][j];
        }


        for (int i = 1; i < arrays.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                rowSum += arrays[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }


        for (int j = 0; j < arrays[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arrays.length; i++) {
                colSum += arrays[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
                break;
            }
        }


        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            diagonal1Sum += arrays[i][i];
            diagonal2Sum += arrays[i][arrays.length - 1 - i];
        }
        if (diagonal1Sum != magicSum || diagonal2Sum != magicSum) {
            isMagic = false;
        }


        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}




