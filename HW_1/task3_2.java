//Пусть дан произвольный список целых чисел.
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
package HW_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 0, -2, 9, 7, 3, 6, 16, -4, 5));
        System.out.println("Первоначальный список: " + list1);
        System.out.println("Минимальное значение в списке: " + minValueNum(list1));
        System.out.println("Максимальное значение в списке: " + maxValueNum(list1));
        System.out.println("Среднее значение в списке: " + averNum(list1));
    }

    static Integer minValueNum(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }

    static Integer maxValueNum(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }

    static Double averNum(List<Integer> arrList) {
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum += arrList.get(i);
        }
        return (double) sum / arrList.size();
    }
}
