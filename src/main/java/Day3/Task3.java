package Day3;

import java.util.Scanner;

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
