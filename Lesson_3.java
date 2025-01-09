public class Lesson_3 {

    public static void main(String[] args) {
        System.out.println("1. ");
        printThreeWords();
        System.out.println("2. ");
        checkSumSign();
        System.out.println("3. ");
        printColor();
        System.out.println("4. ");
        compareNumbers();
        System.out.println("5. ");
        System.out.println(checkSumInRange(5,10));
        System.out.println("6. ");
        printPositiveOrNegative(-5);
        System.out.println("7. ");
        System.out.println(isNegative(10));
        System.out.println("8. ");
        printStringMultipleTimes("Java", 3);
        System.out.println("9. ");
        System.out.println(isLeapYear(2024));
        System.out.println("10. ");
        int[] resultArray = invertArray();
        for (int num : resultArray) {
            System.out.println(num + " ");
        }
        System.out.println("11. ");
        printArray();
        System.out.println("12. ");
        int[] modifiedArray = modifyArray();
        for (int num: modifiedArray) {
            System.out.println(num + " ");
        }
        System.out.println("13. ");
        createAndPrintDiagonalArray(5);
        System.out.println("14. ");
        int len = 5;
        int initialValue = 10;
        int[] array = createArray(len, initialValue);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1000;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = -1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        // Проверяем, является ли год високосным
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Високосный, если делится на 400
            }
            return true; // Високосный, если делится на 4, но не делится на 100
        }
        return false; // Не високосный
    }

    public static int[] invertArray() {
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
       return array;
    }

    public static void printArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int value : array) {
            System.out.println(value + " ");
        }
    }

    public static int[] modifyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static void createAndPrintDiagonalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
