package Day3;

import java.util.Scanner;
/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        while (cnt < 5){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int res = 0;
            if(y == 0){
                System.out.println("Деление на 0");
                continue;
            }
            res = x/y;
            System.out.println(res);
            cnt++;
        }
    }
}
