//Пусть дан произвольный список целых чисел.

//1) Нужно удалить из него чётные числа
package HW_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(4, 1, 6, 9, 18, -39, 40, 37, 17, 3, 16, 7));
        System.out.println("Первоначальный список: " + list1);
        removEvenNums(list1);
    }

    static void removEvenNums(List<Integer> arrList) {
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println("Список после удаления чётных чисел: " + arrList);

    }
}
