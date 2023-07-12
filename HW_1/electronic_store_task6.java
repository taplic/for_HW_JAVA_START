import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class electronic_store_task6 {
    private Set<Laptop_task6> notebooks = new HashSet();

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
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Бренд");
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
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB"
                                    + notebook.getcolor());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД (в гигабайтах) > ");
                    minValue = sc.nextInt();
                    for (Laptop_task6 notebook : notebooks) {
                        if (notebook.getHdSize() >= minValue) {
                            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB"
                                    + notebook.getcolor());
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
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB"
                                    + notebook.getcolor());
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
                                    notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB"
                                    + notebook.getcolor());
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор критерия.");
            }
        }
    }
}
