//Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
//n! (произведение чисел от 1 до n)
package HW_1;

import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("Введите целое число от 1 до n: ");
        int n = number.nextInt();
        int sum = 0, res = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            res *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, res);
        number.close();
    }
}
