public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Смартфон Poco X6 5G", "01.04.2024" ,"Poco", "Китай",
                750.86, true);
        productsArray[1] = new Product("Кронштейн для монитора ONKRON G80", "30.05.2025" ,"ONKRON", "Китай",
                131.45, false);
        productsArray[2] = new Product("Игровой ноутбук HP Victus Gaming", "01.08.2022" ,"HP", "Китай",
                2878.00, true);
        productsArray[3] = new Product("Смарт-часы Redmi Watch 4", "29.10.2023" ,"Xiaomi", "Китай",
                185.81, false);
        productsArray[4] = new Product("Планшет Samsung Galaxy Tab S10 FE", "03.10.2024 " ,"Samsung", "Вьетнам",
                1555.99, true);

        for (Product product : productsArray) {
            product.printProductInfo();
        }

        //Разделитель
        System.out.print("-----------------------------");
        System.out.println();
        System.out.println();

        Park park = new Park();
        park.showAttractions();
    }
}
