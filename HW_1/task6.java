// Задание
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить
// поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или
// критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
// фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
// необходимому критерию:

// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев -
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task6 {
    public static void main(String[] args) throws Exception {
        Laptop_task6 notebook1 = new Laptop_task6("HP", "Pavilion", "Windows", 4, 128, " черный");
        Laptop_task6 notebook2 = new Laptop_task6("Lenovo", "IdeaPad", "MacOS", 8, 512, " серебристый");
        Laptop_task6 notebook3 = new Laptop_task6("Dell", "Inspiron", "Windows", 8, 256, " белый");
        Laptop_task6 notebook4 = new Laptop_task6("Asus", "Vivobook", "Linux", 16, 512, " серый");
        Laptop_task6 notebook5 = new Laptop_task6("Acer", "Vivobook", "MacOS", 24, 512, " синий");
        Laptop_task6 notebook6 = new Laptop_task6("Lenovo", "Vivobook", "Windows", 32, 512, " серый");
        electronic_store_task6 st = new electronic_store_task6();
        st.add(notebook1);
        st.add(notebook2);
        st.add(notebook3);
        st.add(notebook4);
        st.add(notebook5);
        st.add(notebook6);
        System.out.printf("В наличии следующие модели ноутбуков: ");
        st.print();
        st.critFilter();
    }

    public Set<Laptop_task6> notebooks = new HashSet();

    public void add(Laptop_task6 notebook) {
        notebooks.add(notebook);
    }

    public void print() {
        for (Laptop_task6 notebook : notebooks) {
            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB"
                    + notebook.getcolor());
        }
    }

    public void critFilter() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Бренд");
            System.out.printf("Введите цифру, соответствующую необходимому критерию:");
            int param = sc.nextInt();
            int minValue = 0;
            Object osValue;
            switch (param) {
                case 1:
                    System.out.println("Введите минимальный объем ОЗУ (в гигабайтах) > ");
                    minValue = sc.nextInt();
                    for (Laptop_task6 notebook : notebooks) {
                        if (notebook.getRam() >= minValue) {
                            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД (в гигабайтах) > ");
                    minValue = sc.nextInt();
                    for (Laptop_task6 notebook : notebooks) {
                        if (notebook.getHdSize() >= minValue) {
                            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите название ОС: Windows, Linux, MacOS > ");
                    sc.nextLine();
                    osValue = sc.nextLine();
                    for (Laptop_task6 notebook : notebooks) {
                        if (notebook.getOS().equals(osValue)) {
                            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите название Бренда: Acer, Asus, Dell, HP, Lenovo > ");
                    sc.nextLine();
                    osValue = sc.nextLine();
                    for (Laptop_task6 notebook : notebooks) {
                        if (notebook.getBrand().equals(osValue)) {
                            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор критерия.");
            }
        }
    }
}
