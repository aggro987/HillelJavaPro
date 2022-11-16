package Les6.HW1;

public class HomeWorkApp {
    public static void main(String[] args) {


        printThreeWords();
        spase();
        checkSumSign(1, 1);
        spase();
        printColor(101);
        spase();
        compareNumbers(0, 1);
        spase();
        System.out.println(sum(5, 5));
        spase();
        pozitiveOrNegative(1);
        spase();
        System.out.println(pozitiveOrNegativeTrueFalse(100));
        spase();
        print("Hallo World!!!", 2);
        spase();
        System.out.println(isYearLeap(1));

    }

//10. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void print(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);

        }
    }

    public static boolean pozitiveOrNegativeTrueFalse(int num) {
        if (num >= 0) {
            return false;
        }

        return true;
    }

    public static void pozitiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Число позитивное");
        } else System.out.println("Число негативное");
    }

    public static boolean sum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        return false;
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зелёный");

    }


    public static void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void spase() {
        System.out.println("_____________________");
    }

}
