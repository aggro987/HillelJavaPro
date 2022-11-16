package Les7;
//6. * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
//   "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
//    "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
//    компьютер показывает буквы которые стоят на своих местах.
//    apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие буквы

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    static public String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static boolean flag = false;
    public static int pcChoice = getPCChoice();
    public static String userChoice;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(words));
        while (!flag) {
            userChoice = getUserChoice();
            wordCheck();

        }


    }

    public static void wordCheck() {
        if (words[pcChoice].equals(userChoice)) {
            win();
        } else lose();
    }

    public static void checkingWhatWasGuessed() {
        char[] pin = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        char[] pc = words[pcChoice].toCharArray();
        char[] user = userChoice.toCharArray();
        for (int i = 0; i < user.length; i++) {

            if (pc[i] == user[i]) {
                pin[i] = pc[i];

            } else break;
        }
        System.out.println(Arrays.toString(pin));
    }


    //Выбор пользователя
    public static String getUserChoice() {
        System.out.println("Введите слово: ");
        return scanner.nextLine();
    }

    //Выбор компьютера
    public static int getPCChoice() {
        return random.nextInt(words.length-1);
//        return 0;
    }

    public static void win() {
        System.out.println("Вы правильно угадали слово \"" + words[pcChoice].toUpperCase() + "\"\nПоздравляем!!!");
        flag = true;
    }

    public static void lose() {

        System.out.println("Слово не было отгадано");
        checkingWhatWasGuessed();
        System.out.println("Попробоуем еще раз.");
    }
}
