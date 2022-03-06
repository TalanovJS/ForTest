package Day3;
/*
Реализовать программу, которая в консоль выводит название страны, принимая на
вход название города. Программа должна работать до тех пор, пока не будет введено
слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String s = scanner.nextLine();
            if(s.equals("Стоп")){
                System.out.println("Конец программы");
                break;
            }
            switch (s) {
                case "Москва":
                case "Самара":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Анлгия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
