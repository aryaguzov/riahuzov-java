import static util.InputUtil.parse;
import static util.InputUtil.readLine;

public class Task1 {
    private static final int DEFAULT_NUMBER = 7;

    public static void main(String[] args) {
        System.out.println("Задание 1: если введенное число больше 7, то вывести \"Привет\"");
        int number = parse(readLine("Введите целое число:"));
        checkAndPrint(number);
        System.out.println("Задание 1 завершено.");
    }

    private static void checkAndPrint(int number) {
        if (number > DEFAULT_NUMBER) {
            System.out.println("Привет");
        }
    }
}
