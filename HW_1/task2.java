//Вывести все простые числа от 1 до 1000
package HW_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.printf("Введите целое число от 1 до 1000, чтобы вывести все простые числа в этом промежутке: ");
        int n = num.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {

            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                count++;
                System.out.printf(i + ", ");
            }

        }
        System.out.printf("Количество чисел в этом промежутке: " + count);
        num.close();

    }
}
