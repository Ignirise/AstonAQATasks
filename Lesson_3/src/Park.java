public class Park {
    class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " BYN");
            System.out.println();
        }
    }

    public void showAttractions() {
        Attraction a1 = new Attraction("Карусели", "9:00 - 18:00", 5.0);
        Attraction a2 = new Attraction("Колесо обозрения", "11:00 - 22:00", 12.5);
        Attraction a3 = new Attraction("Американские горки", "10:00 - 19:00", 15.0);
        a1.printAttractionInfo();
        a2.printAttractionInfo();
        a3.printAttractionInfo();
    }
}
