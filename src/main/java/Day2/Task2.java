package Day2;

import java.util.Scanner;

/*
Есть два числа, которые задаются пользователем через консоль (назовем эти два
числа a и b). Используя цикл for, вывести все числа из диапазона между a и b,
которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
Например, число 15 подходит под наше условие (делится на 5 без остатка и не
делится на 10 без остатка), но число 20 не подходит под наше условие (делится на 5
без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
Если a >= b вывести сообщение "Некорректный ввод".
 */
public class Task2 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        boolean c = false;

        if(a >= b){
            c = true;
            System.out.println("Heкорректный ввод");
        }

        for (int i = a + 1; i <= b ; i++) {
            if ((i % 5 == 0 && i % 10 != 0) || c) {
                System.out.println("Вывод чисел: " + i);
            }
        }
        scanner.close();
    }
}
