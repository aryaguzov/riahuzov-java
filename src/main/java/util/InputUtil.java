package util;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner;

    private InputUtil() {
    }

    public static String readLine(String description) {
        String line = null;

        try {
            scanner = new Scanner(System.in);
            System.out.println(description);
            line = scanner.nextLine();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        return line;
    }

    public static void close() {
        scanner.close();
    }

    public static int parse(String line) {
        int number = 0;

        try {
            number = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число.");
        }

        return number;
    }
}
