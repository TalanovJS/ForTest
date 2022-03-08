package Day4;

/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
    а) Длине массива
    б) Количестве чисел больше 8
    в) Количестве чисел равных 1
    г) Количестве четных чисел
    д) Количестве нечетных чисел
    е) Сумме всех элементов массива
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[x];
        int count1 = 0;
        int count2 = 0;
        int all = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println("Длине массива - " + arr.length);


        for (int j : arr) {
            if (j > 8) {
                count1++;
            } else if (j == 1) count2++;
        }
        System.out.println("Количестве чисел больше 8 - " + count1);
        System.out.println("Количестве чисел равных 1 - " + count2);

        count1 = 0;
        count2 = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
            all += j;
        }
        System.out.println("Количестве четных чисел - " + count1);
        System.out.println("Количестве нечетных чисел - " + count2);
        System.out.println("Сумме всех элементов массива - " + all);
        scanner.close();
    }
}
