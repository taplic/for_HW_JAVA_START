//Задание

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> subscrib = new HashMap<>() {
            {
                put("Иванов", new ArrayList<Integer>() {
                    {
                        add(6785678);
                        add(8978987);
                        add(7896545);
                    }
                });
                put("Сидоров", new ArrayList<Integer>() {
                    {
                        add(1238976);
                    }
                });
                put("Петров", new ArrayList<Integer>() {
                    {
                        add(3838976);
                        add(3777656);

                    }
                });
                put("Ерошенков", new ArrayList<Integer>() {
                    {
                        add(6446578);
                        add(2227654);
                        add(8302345);
                        add(9991234);
                    }
                });
                put("Смирнова", new ArrayList<Integer>() {
                    {
                        add(6445647);
                        add(2226578);
                        add(8303456);
                        add(9993456);
                        add(9883456);
                    }
                });
                put("Жидкова", new ArrayList<Integer>() {
                    {
                        add(6444678);
                    }
                });
            }
        };
        System.out.println();
        sortedPhoneDescend(subscrib);
    }

    static void sortedPhoneDescend(Map<String, ArrayList<Integer>> map) {

        Set<String> keySet = map.keySet();
        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }
        Stack<String> st = new Stack<>();
        int numberPhone = minCount;
        while (numberPhone <= maxCount) {
            for (var item : map.entrySet()) {
                if (item.getValue().size() == numberPhone) {
                    st.push(item.getKey());
                }
            }
            numberPhone += 1;
        }
        String surnameAbon;
        for (int i = 0; i < keySet.size(); i++) {
            surnameAbon = st.pop();
            for (var item : map.entrySet()) {
                if (surnameAbon == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
    }
}
