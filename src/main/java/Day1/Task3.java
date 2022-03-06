package Day1;
/*
Объявите переменную типа int, имя переменной - k. Присвойте этой переменной
какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
выведите в консоль таблицу умножения для этой цифры в следующем формате:
 */
public class Task3 {
    public static void main(String[] args) {
        int i = 2;
        for (int j = 1; j <= 9 ; j++) {
            System.out.println(j + " * " + i + " = " + j*i);
        }
    }
}
