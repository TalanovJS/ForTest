package Day2;
/*
Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”,
9 и более - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int c;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        if(i>=1 && i<=4){
            System.out.println("Малоэтажный дом");
        } else if(i>=5 && i<=8){
            System.out.println("Среднеэтажный дом");
        } else if(i>=9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
