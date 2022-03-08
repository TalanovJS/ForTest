package Day4;

import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.

 */
public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int maxSum = 0;
        int maxIndex = 0;

        final Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой - " + maxIndex);
    }
}
