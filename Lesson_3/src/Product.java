public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String originCountry;
    double price;
    boolean isReserved;

    public Product(String name, String productionDate, String manufacturer, String originCountry, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printProductInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + originCountry);
        System.out.println("Цена: " + price + " BYN");
        if (isReserved) System.out.println("Забронировано: Да");
        else System.out.println("Забронировано: Нет");
        System.out.println();
    }
}
