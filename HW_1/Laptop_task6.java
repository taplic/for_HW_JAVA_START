public class Laptop_task6 {
    private String brand;
    private String model;
    private String OS;
    private int ram;
    private int hdSize;
    private String color;

    public Laptop_task6(String brand, String model, String OS, int ram, int hdSize, String color) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.ram = ram;
        this.hdSize = hdSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "Рекомендуемая модель ноутбука: %s \n ОЗУ: %d Гб \n Объем ЖД %d Гб \n ОС %s \n Цвет %s \n ",
                this.brand, this.model, this.ram, this.OS, this.color, this.hdSize);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop_task6) {
            return this.hdSize == ((Laptop_task6) obj).hdSize && this.model.equals(((Laptop_task6) obj).model)
                    && this.ram == ((Laptop_task6) obj).ram
                    && this.OS.equals(((Laptop_task6) obj).OS)
                    && this.color.equals(((Laptop_task6) obj).color)
                    && this.brand.equals(((Laptop_task6) obj).brand);

        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOS() {
        return OS;
    }

    public int getRam() {
        return ram;
    }

    public int getHdSize() {
        return hdSize;
    }

    public String getcolor() {
        return color;
    }
}
