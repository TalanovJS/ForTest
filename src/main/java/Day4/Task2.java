package Day4;

import java.util.Arrays;
import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        int min = 10000;
        int cnt = 0;

        final Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(min);
        }

        for(int i: arr){
            if(i > max){
                max = i;
            }
            for(int y: arr){
                if(y < min){
                min = y;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент массива - " + max);
        System.out.println("Наименьшся элемент массива - " + min);

        max = 0;

        for (int i: arr){
            if(i % 10 == 0){
                max += i;
                cnt++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0 - " + cnt);
        System.out.println("Сумму элементов массива, оканчивающихся на 0 - " + max);
    }
}
