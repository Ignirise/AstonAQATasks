@SuppressWarnings("LanguageDetectionInspection")
public class Main {
    public static void main(String[] args) {
        // 1. Напечатать три слова
        printThreeWords();

        // 2. Проверка суммы
        System.out.println();
        checkSumSign();

        // 3. Вывод цвета
        System.out.println();
        printColor();

        // 4. Сравнение чисел
        System.out.println();
        compareNumbers();

        // 5. Проверка суммы в пределах от 10 до 20
        System.out.println();
        int num1 = 20;
        int num2 = 8;
        System.out.println("Сумма чисел " + num1 + " и " + num2 + " в диапазоне 10..20: " + isSumInRange(num1, num2));

        // 6. Проверка числа на то положительное оно или отрицательное (ноль положительный)
        System.out.println();
        printNumberSign(0);
        printNumberSign(-10);

        // 7. Вернуть true если число отрицательное
        System.out.println();
        int x = -5, y = 4;
        System.out.println("Является ли число " + x + " отрицательным? " + isNegative(x));
        System.out.println("Является ли число " + y + " отрицательным? " + isNegative(y));

        // 8. Написать указанную строку несколько раз
        System.out.println();
        printStringTimes("Привет, Астон!", 5);
    }

    // 1.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2.
    public static void checkSumSign() {
        int a = 15;
        int b = 36;
        int sum = a + b;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    // 3.
    public static void printColor() {
        int value = -3;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 & value <= 100) System.out.println("Жёлтый");
        else if (value > 100) System.out.println("Зелёный");
    }

    // 4.
    public static void compareNumbers() {
        int a = 7;
        int b = 3;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    // 5.
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // 6.
    public static void printNumberSign(int num) {
        if (num >= 0) System.out.println("Число " + num + " положительное");
        else System.out.println("Число " + num + " отрицательное");
    }

    // 7.
    public static boolean isNegative(int num) {
        return num < 0;
    }

    // 8.
    public static void printStringTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}