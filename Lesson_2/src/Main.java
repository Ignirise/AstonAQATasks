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

        // 9. Определение високосного года
        System.out.println();
        int year = 2077;
        System.out.println(year + " является високосным: " + isLeapYear(year));

        // 10. Инвертировать массив
        System.out.println();
        int[] arr = {1, 1, 0, 1, 1, 0, 0, 0};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        System.out.println();
        invertArray(arr);
        System.out.print("Инвертированный массив: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        // 11. Заполнить массив
        System.out.println();
        int[] arr100;
        arr100 = fillArray(100);
        System.out.print("Заполненный массив: ");
        for (int i = 0; i < arr100.length; i++) System.out.print(i + " ");
        System.out.println();

        // 12. Если число в массиве меньше 6, то умножить его на 2
        System.out.println();
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");

        System.out.println();
        multiplyLessThanSix(arr2);
        System.out.print("Изменённый массив: ");
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
        System.out.println();

        // 13. Заполнить двумерный массив единицами по диагонали
        System.out.println();
        int size = 5;
        int[][] matrix = new int[size][size];
        fillDiagonal(matrix);
        System.out.println("Матрица с дигоналями:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 14. Одномерный массив типа int длиной len с ячейками = initialValue
        System.out.println();
        int[] customArr = createArrayWithValue(5, 88);
        System.out.print("Массив: ");
        for (int i = 0; i < customArr.length; i++) {
            System.out.print(customArr[i] + " ");
        }
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

    // 9.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // 10.
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
    }

    // 11.
    public static int[] fillArray(int len) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // 12.
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    // 13.
    public static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
    }

    // 14.
    public static int[] createArrayWithValue(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}